package Graph.BFS;

import java.util.*;

public class Graph {
    Map<Node, LinkedList<Node>> adjMap;

    public Graph() {
        adjMap = new HashMap<>();
    }

    void edgeMaker(Node a, Node b) {
        LinkedList<Node> temp = adjMap.get(a);

        if (temp != null) temp.remove(b);
        else temp = new LinkedList<>();
        temp.add(b);
        adjMap.put(a, temp);
    }

    void undirectedEdge(Node src, Node dest) {
        if (!adjMap.containsKey(src)) adjMap.put(src, null);
        if (!adjMap.containsKey(dest)) adjMap.put(dest, null);
        edgeMaker(src, dest);
        edgeMaker(dest, src);
    }

    void directedEdge(Node src, Node dest) {
        if (!adjMap.containsKey(src)) adjMap.put(src, null);
        if (!adjMap.containsKey(dest)) adjMap.put(dest, null);
        edgeMaker(src, dest);
    }
}