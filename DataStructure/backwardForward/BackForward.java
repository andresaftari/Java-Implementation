package DataStructure.backwardForward;

import java.util.Stack;

public class BackForward {
    private Stack<String> backStack;
    private Stack<String> forwardStack;

    public BackForward() {
        backStack = new Stack<>(); // (1)
        forwardStack = new Stack<>(); //(2)
    }

    public void tambahData(String value) {
        backStack.push(value);   //(3)
        forwardStack.clear();   //(4)
        System.out.println("Website " + value + " dibuka");
    }

    public void back() {
        if (backStack.isEmpty()) { // (5)
            System.out.println("List back kosong");
        } else {
            String value = backStack.pop(); // (6)
            forwardStack.push(value); // (7)
            System.out.println("Mundur ke alamat " + value); //(8)
        }
    }


    public void forward() {
        if (forwardStack.isEmpty()) {
            System.out.println("List forward kosong");
        } else {
            String value = forwardStack.pop(); // (9)
            backStack.push(value); // (10)
            System.out.println("Kembali lagi ke alamat " + value);
        }
    }
}
