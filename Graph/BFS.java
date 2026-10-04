import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class BFS {
    static class Edge{
        int src, dest;

        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i < graph.length; i++){
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

    public static void bfs(ArrayList<Edge> graph[], int vertex){
        //create queue
        Queue<Integer> queue = new LinkedList<>();

        boolean visited[] = new boolean[vertex];

        queue.add(0);

        while(!queue.isEmpty()){
            int current = queue.remove();
            if(visited[current] == false){

                // 1.print current
                System.out.println(current + " ");
                // 2. make visited current = true
                visited[current] = true;
                
                // 3. add current neighbours into the queue
                for(int i = 0; i < graph[current].size(); i++ ){
                    Edge e = graph[current].get(i);
                    queue.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args){
        int vertex = 4;
        ArrayList<Edge> graph[] = new ArrayList[vertex];

        createGraph(graph);

        bfs(graph, vertex);

    }

}
