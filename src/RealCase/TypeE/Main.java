package RealCase.TypeE;

import java.util.LinkedList;
import java.util.Stack;

public class Main {
    private static final Stack<String> back = new Stack<>();
    private static final Stack<String> forward = new Stack<>();

    // Struktur history bisa Linkedlist, Arraylist, Stack, dll
    private static final LinkedList<String> history = new LinkedList<>();

    public static void main(String[] args) {
        Main backForward = new Main();

        backForward.tambahData("https://www.google.com/search?q=comparable+java+integer");
        backForward.tambahData("https://www.javatpoint.com/java-integercompareto-method");
        backForward.tambahData("https://www.javatpoint.com/java-integercompareunsigned-method");

        backForward.back();
        backForward.forward();

        backForward.history();
    }

    private void tambahData(String site) {
        back.push(site);
        history.add(site);
        // Setiap buka new site, hapus Stack forward
        if (!forward.isEmpty()) forward.clear();

        System.out.println("Website " + site + " dibuka");
    }

    private void back() {
        // Stack back harus dicek kosong atau ada isinya
        if (!back.isEmpty()) {
            String value = back.pop();
            forward.push(value);

            System.out.println("Mundur ke alamat " + back.peek());
        } else {
            System.out.println("Sudah tidak bisa back!");
        }
    }

    private void forward() {
        // Stack forward harus dicek kosong atau ada isinya
        if (!forward.isEmpty()) {
            String value = forward.pop();
            back.push(value);

            System.out.println("Kembali ke alamat " + value);
        } else {
            System.out.println("Sudah tidak bisa forward!");
        }
    }

    private void history() {
        // Bisa di-forloop/foreach/iterator, bisa langsung begini
        System.out.println(history);
    }
}
