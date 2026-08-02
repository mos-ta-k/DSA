import java.util.ArrayList;
public interface WeightedGraph {
    
    //create edge
    static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int src, int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>(); //create arraylist for earch vertex
        }

        graph[0].add(new Edge(0, 2,2));
        graph[1].add(new Edge(1, 3,3));
        graph[1].add(new Edge(1, 2,4));
        graph[2].add(new Edge(2, 0,9));
        graph[2].add(new Edge(2, 3,5));
        graph[2].add(new Edge(2, 1,1));
        graph[3].add(new Edge(3, 1,4));
        graph[3].add(new Edge(3, 2,3));
    }

    public static void main(String[] args){
        int vertex = 4;

        ArrayList<Edge> graph[] = new ArrayList[vertex];

        createGraph(graph);

        //print neighbours of vertex 2
        for(int i = 0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.println(e.src + " -> " + e.dest + " " + e.weight);
        }

    }

}
