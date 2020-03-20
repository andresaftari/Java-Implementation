package DataStructure.backwardForward;

public class BackOperation {
    public static void main(String[] args) {
        BackForward backForward = new BackForward();

        backForward.tambahData("https://www.google.com/search?q=comparable+java+integer");
        backForward.tambahData("https://www.javatpoint.com/java-integer-compareto-method");
        backForward.tambahData("https://www.javatpoint.com/java-integer-compareunsigned-method");

        backForward.back();
        backForward.forward();
    }
}
