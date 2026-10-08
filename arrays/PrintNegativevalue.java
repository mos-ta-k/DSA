import java.util.Scanner;

public class PrintNegativevalue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array items: ");
        for(int i = 0; i< n; i++)
            arr[i] = scanner.nextInt();

        // printing negative values
        for(int i = 0; i<n; i++)
            if(arr[i] < 0) System.out.print(arr[i] + " ");
    }
}
