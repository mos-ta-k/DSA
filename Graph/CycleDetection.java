import java.util.ArrayList;
public class CycleDetection {
    public static class Edge{
        int src, dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    //create graph
    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(2,0));
        graph[0].add(new Edge(0,3));
        graph[0].add(new Edge(3,2));
        graph[0].add(new Edge(0,1));
    }

    public static boolean isCycleDirected(ArrayList<Edge> graph[], boolean visited[], int current, boolean recursionStack[]){
        visited[current] = true;
        recursionStack[current] = true;

        for(int i = 0; i < graph[current].size(); i++){
            Edge e = graph[current].get(i);
            // if the destination node already is in recursion stack return true - cycle detected
            if(recursionStack[e.dest]){
                return true;
            }else if(!visited[e.dest]){
                if(isCycleDirected(graph, visited, e.dest, recursionStack)){
                    return true;
                }
            }
        }
        recursionStack[current] = false;
        return false;
    }

    public static void main(String[] args){
        int vertex = 4;

        ArrayList<Edge> graph[] = new ArrayList[vertex];
        createGraph(graph);

        System.out.println(isCycleDirected(graph, new boolean[vertex], 0, new boolean[vertex]));
    }
}
