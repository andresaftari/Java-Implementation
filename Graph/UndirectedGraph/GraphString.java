import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GraphString<Generic> {
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
        GraphString<String> graphOps = new GraphString<>();

        graphOps.addEdges("A", "B");
        graphOps.addEdges("A", "C");
        graphOps.addEdges("A", "D");
        graphOps.addEdges("B", "C");
        graphOps.addEdges("B", "E");
        graphOps.addEdges("D", "E");
        graphOps.addEdges("D", "F");

        System.out.println("Adjacency List : \n" + graphOps.toString());
    }
}
