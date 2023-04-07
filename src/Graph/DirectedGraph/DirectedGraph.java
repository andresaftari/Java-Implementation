package Graph.DirectedGraph;

import java.util.*;

public class DirectedGraph<T> {
    private Map<T, List<T>> graphMapper = new HashMap<>();

    void addEdges(T src, T dest) {
        if (!graphMapper.containsKey(src)) addNodes(src);
        if (!graphMapper.containsKey(dest)) addNodes(dest);

        graphMapper.get(src).add(dest);
    }

    void addNodes(T vertex) {
        graphMapper.put(vertex, new LinkedList<>());
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for (T head : graphMapper.keySet()) {
            strBuilder.append("Vertex ").append(head.toString()).append(" --> ");
            
            for (T vertexes : graphMapper.get(head)) {
                strBuilder.append(vertexes).append(" ");   
            }
            strBuilder.append("\n");
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        DirectedGraph<String> operator = new DirectedGraph<>();

        operator.addEdges("A", "B");
        operator.addEdges("A", "D");
        operator.addEdges("A", "E");
        operator.addEdges("B", "E");
        operator.addEdges("C", "B");
        operator.addEdges("D", "G");
        operator.addEdges("E", "F");
        operator.addEdges("E", "H");
        operator.addEdges("F", "C");
        operator.addEdges("F", "H");
        operator.addEdges("G", "H");
        operator.addEdges("H", "I");
        operator.addEdges("I", "F");

        System.out.println("Adjacency List : \n" + operator);
    }
}
