import java.util.ArrayList;
import java.util.LinkedList;

public class DFS {
   
    static class Edge{
        int src, dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i <graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));
    }

    public static void dfs(ArrayList<Edge> graph[], int current, boolean visited[]){
        if (visited[current]) {
            return;
        }
        // 1.print current
        System.out.println(current + " ");

        // 2. make visited current = true
        visited[current] = true;
        
        // 3. visit all neighbours
        for (int i = 0; i < graph[current].size(); i++){
            Edge e = graph[current].get(i);
            dfs(graph, e.dest, visited);
        }
    }

    public static void main(String[] args){
        int vertex = 4;

        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);
        boolean visited[] = new boolean[vertex];
        dfs(graph, 0, visited);
    }

}
