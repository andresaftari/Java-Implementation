package BubbleSortAlgorithm;

public class BubbleSort {
    private static void bubbleSort(int[] array, int input) {
        int i, j, container;
        boolean swap;

        for (i = 0; i < input - 1; i++) {
            swap = false;
            for (j = 0; j < input - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    container = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = container;
                    swap = true;
                }

            if (!swap)
                break;
        }
    }

    private static void printSorted(int[] array, int arraySize) {
        for (int i = 0; i < arraySize; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {6, 5, 2, 10, 9, 3, 15, 20, 60};
        int arrLen = data.length;
        bubbleSort(data, arrLen);
        System.out.println("Bubble sorted : ");
        printSorted(data, arrLen);
    }
}
