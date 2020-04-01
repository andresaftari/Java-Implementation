import java.util.*;

public class GraphInteger<Generic> {
    private Map<Generic, List<Generic>> graphMapper = new HashMap<>();

    void addVertexes(Generic vertex) {
        graphMapper.put(vertex, new LinkedList<>());
    }

    void addEdges(Generic src, Generic dest) {
        if (!graphMapper.containsKey(src)) addVertexes(src);
        if (!graphMapper.containsKey(dest)) addVertexes(dest);

        graphMapper.get(src).add(dest);
        graphMapper.get(dest).add(src);
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        for (Generic vertex1 : graphMapper.keySet()) {
            strBuilder.append("Vertex ").append(vertex1.toString()).append(" -> ");
            for (Generic vertex2 : graphMapper.get(vertex1)) strBuilder.append(vertex2.toString()).append(" ");
            strBuilder.append("\n");
        }
        return strBuilder.toString();
    }

    public static void main(String[] args) {
        GraphInteger<Integer> graphOps = new GraphInteger<>();

        graphOps.addEdges(0, 1);
        graphOps.addEdges(0, 2);
        graphOps.addEdges(0, 3);
        graphOps.addEdges(1, 2);
        graphOps.addEdges(1, 4);
        graphOps.addEdges(3, 4);
        graphOps.addEdges(3, 5);

        System.out.println("Adjacency List : \n" + graphOps.toString());
    }
}
