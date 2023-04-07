package Graph.BFS;

public class Node {
    Integer number;
    String name;
    boolean isVisited;

    public Node(Integer number, String name) {
        this.number = number;
        this.name = name;
        isVisited = false;
    }

    void visits() {
        isVisited = true;
    }
}
