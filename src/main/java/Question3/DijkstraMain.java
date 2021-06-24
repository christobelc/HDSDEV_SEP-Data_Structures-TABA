package Question3;

/*Reference from https://java2blog.com/dijkstra-java/*/

public class DijkstraMain {

    public static void main(String[] args) {

        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexF = new Vertex("F");
        Vertex vertexG = new Vertex("G");
        Vertex vertexH = new Vertex("H");

        vertexA.addNeighbour(new Edge(2,vertexA,vertexB));
        vertexA.addNeighbour(new Edge(3,vertexA,vertexC));
        vertexB.addNeighbour(new Edge(4,vertexB,vertexD));
        vertexB.addNeighbour(new Edge(7,vertexB,vertexE));
        vertexC.addNeighbour(new Edge(2,vertexC,vertexE));
        vertexC.addNeighbour(new Edge(5,vertexC,vertexD));
        vertexD.addNeighbour(new Edge(6,vertexD,vertexF));
        vertexE.addNeighbour(new Edge(4,vertexE,vertexF));
        vertexE.addNeighbour(new Edge(6,vertexE,vertexG));
        vertexF.addNeighbour(new Edge(2,vertexF,vertexG));
        vertexF.addNeighbour(new Edge(3,vertexF,vertexH));
        vertexG.addNeighbour(new Edge(3,vertexG,vertexH));

        DijkstraShortestPath shortestPath = new DijkstraShortestPath();
        shortestPath.computeShortestPaths(vertexA);


        System.out.println("=====================   =================");
        System.out.println("Calculating Paths");
        System.out.println("======================================");


        System.out.println("Shortest Path from A to E: "+shortestPath.getShortestPathTo(vertexH));

    }
}