package BST;

import java.io.*;
import java.util.*;

public class BSTGeneric {
    private Nodes rootNode;

    private void binaryTree() {
        addNode(rootNode, 25);
        addNode(rootNode, 23);
        addNode(rootNode, 30);
        addNode(rootNode, 15);
        addNode(rootNode, 6);
        addNode(rootNode, 45);
        addNode(rootNode, 27);
        addNode(rootNode, 10);
        addNode(rootNode, 33);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BSTGeneric operator = new BSTGeneric();
        operator.binaryTree();

        do {
            System.out.println("Choose a solution :\n1. Use Preorder Traversal\n2. Use Inorder Traversal\n3. Use Postorder Traversal\n4. Use Level Order Traversal\n5. Exit");
            int option = Integer.parseInt(br.readLine());

            switch (option) {
                case 1:
                    operator.printPreOrder(operator.rootNode);
                    System.out.println();
                    break;

                case 2:
                    operator.printInOrder(operator.rootNode);
                    System.out.println();
                    break;

                case 3:
                    operator.printPostOrder(operator.rootNode);
                    System.out.println();
                    break;

                case 4:
                    operator.printLevelOrder(operator.rootNode);
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Good bye and stay safe!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Sorry, option " + option + " is invalid");
            }
        }
        while (true);
    }
    
    // Generic class of Nodes (Vertex)
    static class Nodes {
        Nodes left, right;
        Integer data;

        Nodes(Integer data) {
            this.data = data;
        }

        void setLeft(Nodes left) {
            this.left = left;
        }

        void setRight(Nodes right) {
            this.right = right;
        }
    }

    // Adding Vertex
    private void addNode(Nodes rootNode, int data) {
        if (rootNode == null) this.rootNode = new Nodes(data);
        else addNodeForProperPlace(rootNode, data);
    }

    // Adding proper placed Vertex for InOrder
    private void addNodeForProperPlace(Nodes rootNode, int data) {
        if (data > rootNode.data)
            if (rootNode.right != null) addNode(rootNode.right, data);
            else {
                Nodes temporary = new Nodes(data);
                rootNode.setRight(temporary);
            }
        else if (data < rootNode.data)
            if (rootNode.left != null) addNode(rootNode.left, data);
            else {
                Nodes temporary = new Nodes(data);
                rootNode.setLeft(temporary);
            }
    }
    
    // Level Order (Starts with root, continue with level-based traversal)
    private void printLevelOrder(Nodes rootNode) {
        if (rootNode == null) return;
        Queue<Nodes> nodeQueue = new LinkedList<>();
        nodeQueue.add(rootNode);

        while (!nodeQueue.isEmpty()) {
            Nodes obj = nodeQueue.poll();
            System.out.print(obj.data + " ");
            if (obj.left != null) nodeQueue.add(obj.left);
            if (obj.right != null) nodeQueue.add(obj.right);
        }
    }

    // Pre Order solution (Starts from root, continue with left side, ends with right side)
    private void printPreOrder(Nodes node) {
        if (node != null) {
            System.out.print(node.data + " ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    // In Order solution (Starts from left side, to the root, ends with right side)
    private void printInOrder(Nodes node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.print(node.data + " ");
            printInOrder(node.right);
        }
    }

    // Post Order solution (Starts from left side, continue with right side, ends with root)
    private void printPostOrder(Nodes node) {
        if (node != null) {
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
