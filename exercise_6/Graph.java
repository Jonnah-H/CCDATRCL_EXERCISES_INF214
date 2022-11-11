public class Graph {

    // inner class
    // to keep track of edges
    class Edge {
        String src, dest;
    }

    // number of vertices and edges
    int vertices, edges;

    // array to store all edges
    Edge[] edge;

    Graph(int vertices, int edges) {
        this.vertices = vertices;
        this.edges = edges;

        // initialize the edge array
        edge = new Edge[edges];
        for (int i = 0; i < edges; i++) {

            // each element of the edge array
            // is an object of Edge type
            edge[i] = new Edge();
        }
    }

    public static void main(String[] args) {

        // create an object of Graph class
        int noVertices = 10;
        int noEdges = 10;
        Graph myGraph = new Graph(noVertices, noEdges);

        // create graph

        // Edge 1
        myGraph.edge[0].src = "Jonnah";
        myGraph.edge[0].dest = "Hazel";

        // Edge 2
        myGraph.edge[1].src = "Jonnah";
        myGraph.edge[1].dest = "Harold";

        // Edge 3
        myGraph.edge[2].src = "Hazel";
        myGraph.edge[2].dest = "Harold";

        // Edge 4
        myGraph.edge[3].src = "Harold";
        myGraph.edge[3].dest = "Jenny";

        // Edge 5
        myGraph.edge[4].src = "Hazel";
        myGraph.edge[4].dest = "Byron";    

        // Edge 6
        myGraph.edge[5].src = "Byron";
        myGraph.edge[5].dest = "Lyndon";

        // Edge 7
        myGraph.edge[6].src = "Byron";
        myGraph.edge[6].dest = "Carlo";

        // Edge 8
        myGraph.edge[7].src = "Carlo";
        myGraph.edge[7].dest = "Iboi";     

        // Edge 9
        myGraph.edge[8].src = "Iboi";
        myGraph.edge[8].dest = "Fatima";

        // Edge 10
        myGraph.edge[9].src = "Fatima";
        myGraph.edge[9].dest = "Marie";

        // print graph
        for (int i = 0; i < noEdges; i++) {
            System.out.println(myGraph.edge[i].src + " - " + myGraph.edge[i].dest);
        }

    }
}

    
