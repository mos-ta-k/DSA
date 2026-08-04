import java.util.ArrayList;

public class AllPathFromSourceToTarget {

    static class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void creategraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1)); // fixed: was Edge(0,2) duplicated
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void printAllPath(ArrayList<Edge>[] graph, boolean[] visited, int current, String path, int target) {
        if (current == target) {
            System.out.println(path);
            return;
        }

        visited[current] = true;
        for (int i = 0; i < graph[current].size(); i++) {
            Edge e = graph[current].get(i);
            if (!visited[e.dest]) {
                printAllPath(graph, visited, e.dest, path + "->" + e.dest, target);
            }
        }
        visited[current] = false;
    }

    public static void main(String[] args) {
        int vertex = 7;

        ArrayList<Edge>[] graph = new ArrayList[vertex];
        creategraph(graph);

        int src = 0, dest = 5;
        printAllPath(graph, new boolean[vertex], src, "0", dest);
    }
}