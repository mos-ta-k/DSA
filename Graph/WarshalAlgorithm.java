public class WarshalAlgorithm {

    public static void main(String[] args) {
        int n = 4;
        String[] names = {"a", "b", "c", "d"};

        int[][] W = {
                {0, 1, 0, 0},   // a
                {0, 0, 0, 1},   // b
                {0, 0, 0, 0},   // c
                {1, 0, 1, 0}    // d
        };

        System.out.println("Adjacency matrix:");
        printMatrix(W, names);

        int count = 0;

        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    W[i][k] = W[i][k] | (W[i][j] & W[j][k]);
                    count++;
                }
            }
        }

        System.out.println("Transitive closure:");
        printMatrix(W, names);

        System.out.println("Inner statement ran " + count + " times (n^3 = " + (n * n * n) + ")");
    }

    static void printMatrix(int[][] m, String[] names) {
        System.out.print("  ");
        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println();

        for (int i = 0; i < m.length; i++) {
            System.out.print(names[i] + " ");
            for (int k = 0; k < m.length; k++) {
                System.out.print(m[i][k] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}