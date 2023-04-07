package Graph.DFS;

import java.util.*;

public class DFSIterative {
    static DFSGraph graph = new DFSGraph();

    // Begin traversal of the first level of the Graph
    void DFSstarter(DFSNode node) {
        node.visits();
        System.out.print(node.name + " ");

        List<DFSNode> allAdjacents = graph.adjMap.get(node);
        if (allAdjacents == null) return;

        for (DFSNode adjacent : allAdjacents) if (!adjacent.isVisited) DFSstarter(adjacent);
    }

    // Used to continue traverse the second and more level of the Graph
    void startDFS(DFSNode startNode) {
        DFSstarter(startNode);

        for (DFSNode secondLevel : graph.adjMap.keySet()) if (!secondLevel.isVisited) DFSstarter(secondLevel);
    }

    public static void main(String[] args) {
        DFSIterative operator = new DFSIterative();

        DFSNode nodeA = new DFSNode(0, "A");
        DFSNode nodeB = new DFSNode(1, "B");
        DFSNode nodeC = new DFSNode(2, "C");
        DFSNode nodeD = new DFSNode(3, "D");
        DFSNode nodeE = new DFSNode(4, "E");
        DFSNode nodeF = new DFSNode(5, "F");
        DFSNode nodeG = new DFSNode(5, "G");
        DFSNode nodeH = new DFSNode(5, "H");
        DFSNode nodeI = new DFSNode(5, "I");

        graph.directedEdge(nodeA, nodeB);
        graph.directedEdge(nodeA, nodeD);
        graph.directedEdge(nodeA, nodeE);
        graph.directedEdge(nodeB, nodeE);
        graph.directedEdge(nodeC, nodeB);
        graph.directedEdge(nodeD, nodeG);
        graph.directedEdge(nodeE, nodeF);
        graph.directedEdge(nodeE, nodeH);
        graph.directedEdge(nodeF, nodeC);
        graph.directedEdge(nodeF, nodeH);
        graph.directedEdge(nodeG, nodeH);
        graph.directedEdge(nodeH, nodeI);
        graph.directedEdge(nodeI, nodeF);

        System.out.print("DFS Traversal : ");
        operator.startDFS(nodeA);
    }
}

class DFSGraph {
    Map<DFSNode, LinkedList<DFSNode>> adjMap;

    public DFSGraph() {
        adjMap = new HashMap<>();
    }

    void edgeMaker(DFSNode a, DFSNode b) {
        LinkedList<DFSNode> temp = adjMap.get(a);

        if (temp != null) temp.remove(b);
        else temp = new LinkedList<>();
        temp.add(b);
        adjMap.put(a, temp);
    }

    void directedEdge(DFSNode src, DFSNode dest) {
        if (!adjMap.containsKey(src)) adjMap.put(src, null);
        if (!adjMap.containsKey(dest)) adjMap.put(dest, null);
        edgeMaker(src, dest);
    }
}

class DFSNode {
    Integer number;
    String name;
    boolean isVisited;

    public DFSNode(Integer number, String name) {
        this.number = number;
        this.name = name;
        isVisited = false;
    }

    void visits() {
        isVisited = true;
    }
}