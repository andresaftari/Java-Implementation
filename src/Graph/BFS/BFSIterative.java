package Graph.BFS;

import java.util.*;

public class BFSIterative {
    static Graph graph = new Graph();

    void beginBFS(Node startNode) {
        // Uninitialized node will be returned as null
        if (startNode == null) return;

        // Queue every waiting nodes
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(startNode);

        while (!queue.isEmpty()){
            Node node = queue.removeFirst();

            // In some cases, we might have a duplicated node, so if we found this problem, skip it!
            if (node.isVisited) continue;

            // Mark the visited nodes as VISITED
            node.visits();
            System.out.print(node.name + " ");

            LinkedList<Node> allAdjacent = graph.adjMap.get(node);

            // Check whether the list of adjacents is null or not before proceeding
            if (allAdjacent == null) continue;
            for (Node adjacents: allAdjacent) if (!adjacents.isVisited) queue.add(adjacents);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BFSIterative operator = new BFSIterative();
        Node node0 = new Node(0, "A");
        Node node1 = new Node(1, "B");
        Node node2 = new Node(2, "C");
        Node node3 = new Node(3, "D");
        Node node4 = new Node(4, "E");
        Node node5 = new Node(5, "F");

        graph.undirectedEdge(node0, node1);
        graph.undirectedEdge(node0, node2);
        graph.undirectedEdge(node0, node3);
        graph.undirectedEdge(node1, node4);
        graph.undirectedEdge(node3, node4);
        graph.undirectedEdge(node3, node5);

        System.out.print("BFS Traversal : ");
        operator.beginBFS(node0);
    }
}