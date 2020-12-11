import java.util.LinkedList;

public class WeightedGraph 
{
    static class Edge 
    {
        int source;
        int destination;
        int weight;

        public Edge(int source, int destination, int weight) 
        {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    static class Graph 
    {
        int vertices;
        LinkedList<Edge> [] adjacencylist;

        Graph(int vertices) 
        {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            //initialize adjacency lists for all the vertices

            for (int i = 0; i <vertices ; i++) 
            {
                adjacencylist[i] = new LinkedList<>();
            }
        }

        public void addEgde(int source, int destination, int weight)
        {
            Edge edge = new Edge(source, destination, weight);
            adjacencylist[source].addFirst(edge); //for directed graph
        }

       public void printGraph()
       {
            for (int i = 0; i <vertices ; i++) 
            {
                LinkedList<Edge> list = adjacencylist[i];

                for (int j = 0; j <list.size() ; j++) 
                {
                    System.out.println("vertex-" + i + " is connected to " +
                            list.get(j).destination + " with weight " +  list.get(j).weight);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int vertices = 6;
        Graph obj = new Graph(vertices);
        obj.addEgde(0, 3, 8);
        obj.addEgde(0, 2, 3);
        obj.addEgde(1, 3, 2);
        obj.addEgde(1, 2, 5);
        obj.addEgde(2, 3, 7);
        obj.addEgde(3, 4, 2);
        obj.addEgde(4, 0, 4);
        obj.addEgde(4, 1, 4);
        obj.addEgde(4, 5, 6);
        obj.printGraph();
    }
}
