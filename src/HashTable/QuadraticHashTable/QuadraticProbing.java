package HashTable.QuadraticHashTable;

import java.util.Arrays;

public class QuadraticProbing {
    int arraySize;
    String[] theArray;

    public static void main(String[] args) {
        QuadraticProbing function = new QuadraticProbing(13);

        String[] elementToAdd = {"3", "27", "41", "13", "4", "51", "9", "45", "23", "7", "8"};

        function.DoubledHashFunction(elementToAdd, function.theArray);
        function.displayTheStack();
    }

    void DoubledHashFunction(String[] stringsForArray, String[] theArray) {
        for (String newElementValue : stringsForArray) {
            int x = 0;
            int arrayIndex = (Integer.parseInt(newElementValue) * 3 + (int) Math.pow(x, 2)) % theArray.length;
            System.out.println("Modulus index " + arrayIndex + " for value " + newElementValue);

            // Cycle sampai ditemukan empty spaces
            while (!theArray[arrayIndex].equals("-1")) {
                arrayIndex = (int) (arrayIndex + Math.pow(x, 2)) % theArray.length;

                x++;
            }
            theArray[arrayIndex] = newElementValue;
        }
    }

    QuadraticProbing(int size) {
        arraySize = size;
        theArray = new String[size];

        // Isi empty space dengan negative
        fillArrayWithNegative();
    }

    void fillArrayWithNegative() {
        Arrays.fill(theArray, "-1");
    }

    public void displayTheStack() {
        int increment = 0;
        int numberOfRows = (arraySize / 10) + 1;

        for (int m = 0; m < numberOfRows; m++) {
            increment += 10;

            for (int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();

            for (int n = increment - 10; n < increment; n++)
                System.out.format("| %3s " + " ", n);
            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();

            for (int n = increment - 10; n < increment; n++) {
                if (n >= arraySize)
                    System.out.print("|      ");
                else if (theArray[n].equals("-1"))
                    System.out.print("|      ");
                else
                    System.out.print(String.format("| %3s " + " ", theArray[n]));
            }
            System.out.println("|");

            for (int n = 0; n < 71; n++)
                System.out.print("-");
            System.out.println();
        }
    }
}
