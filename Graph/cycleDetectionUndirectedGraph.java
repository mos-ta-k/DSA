
import java.lang.reflect.Array;
import java.util.ArrayList;

public class cycleDetectionUndirectedGraph {
    public static class Edge {
        int src, dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1)); 
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

    public static boolean isCycle(ArrayList<Edge> graph[], boolean visited[], int current, int parent){
        visited[current] = true;

        // loop for all neighbours
        for(int i = 0; i < graph[current].size(); i++){
            Edge e = graph[current].get(i);

            if(visited[e.dest] && e.dest != parent){
                return true;
            }else if(!visited[e.dest]){
                // to visit invisited node
                if(isCycle(graph, visited, e.dest, current)){
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args){
        int vertex = 7;

        ArrayList<Edge>[] graph = new ArrayList[vertex];
        createGraph(graph);

        System.out.println(isCycle(graph, new boolean[vertex], 0, -1));
    }
}
