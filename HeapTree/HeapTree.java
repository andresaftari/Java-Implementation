package HeapTree;

import java.io.*;

public class HeapTree {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("\nOriginal Tree : 25 23 30 15 6 45 27 10 33 7");
            System.out.println("Choose solution :\n1. Max-Heap with Heapsort\n2. Min-Heap with Heapsort\n" +
                    "3. Max-Heap only\n4. Min-Heap only\n5. Exit");

            int option = Integer.parseInt(br.readLine());

            switch (option) {
                case 1:
                    System.out.print("Max Heap : ");
                    HeapTreeOps max = new HeapTreeOps(256, 0);

                    max.insert(25);
                    max.insert(23);
                    max.insert(30);
                    max.insert(15);
                    max.insert(6);
                    max.insert(45);
                    max.insert(27);
                    max.insert(10);
                    max.insert(33);
                    max.insert(7);

                    max.displayHeap();

                    System.out.print("Ascending order (Max Heapsort) : ");
                    max.ascOrder();
                    break;

                case 2:
                    System.out.print("Min Heap : ");
                    HeapTreeOps min = new HeapTreeOps(256, 1);

                    min.insert(25);
                    min.insert(23);
                    min.insert(30);
                    min.insert(15);
                    min.insert(6);
                    min.insert(45);
                    min.insert(27);
                    min.insert(10);
                    min.insert(33);
                    min.insert(7);

                    min.displayHeap();

                    System.out.print("Descending order (Min Heapsort) : ");
                    min.descOrder();
                    break;

                case 3:
                    System.out.print("Max Heap : ");
                    HeapTreeOps max2 = new HeapTreeOps(256, 0);

                    max2.insert(25);
                    max2.insert(23);
                    max2.insert(30);
                    max2.insert(15);
                    max2.insert(6);
                    max2.insert(45);
                    max2.insert(27);
                    max2.insert(10);
                    max2.insert(33);
                    max2.insert(7);

                    max2.displayHeap();
                    break;

                case 4:
                    System.out.print("Min Heap : ");
                    HeapTreeOps min2 = new HeapTreeOps(256, 1);

                    min2.insert(25);
                    min2.insert(23);
                    min2.insert(30);
                    min2.insert(15);
                    min2.insert(6);
                    min2.insert(45);
                    min2.insert(27);
                    min2.insert(10);
                    min2.insert(33);
                    min2.insert(7);

                    min2.displayHeap();
                    break;

                case 5:
                    System.out.println("Goodbye and stay safe!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("There is no option " + option);
            }
        }
        while (true);
    }
}

class HeapTreeOps {
    private int[] heap;
    private int size;
    private int minMaxFlag;

    HeapTreeOps(int max, int minMaxFlag) {
        heap = new int[max];
        size = 0;
        this.minMaxFlag = minMaxFlag;
    }

    private int parentIndex(int index) {
        return (index - 1) / 2;
    }

    private int leftChildIndex(int index) {
        return (2 * index) + 1;
    }

    private int rightChildIndex(int index) {
        return (2 * index) + 2;
    }

    void insert(int element) {
        if (size == 0) {
            heap[size++] = element;
        } else {
            heap[size] = element;
            heapifyUp(size++);
        }
    }

    // max/min heap based on flag
    private void heapifyUp(int index) {
        int temp = heap[index];
        int parent = parentIndex(index);
        if (this.minMaxFlag == 0) {
            while (index > 0 && heap[parent] < temp) {
                heap[index] = heap[parent];
                index = parent;
                parent = parentIndex(index);

            }
        } else {
            while (index > 0 && heap[parent] > temp) {
                heap[index] = heap[parent];
                index = parent;
                parent = parentIndex(index);

            }
        }
        heap[index] = temp;
    }

    private int remove() {
        int temp = heap[0];
        heap[0] = heap[--size];
        heapifyDown(0);
        return temp;
    }

    private void heapifyDown(int index) {
        int lcIndex;
        int rcIndex;

        int temp = heap[index];
        int largeChildIndex;
        int smallChilIndex;

        if (minMaxFlag == 0) {
            while (index < (size / 2)) {
                lcIndex = leftChildIndex(index);
                rcIndex = rightChildIndex(index);

                if (rcIndex < size && heap[lcIndex] < heap[rcIndex]) largeChildIndex = rcIndex;
                else largeChildIndex = lcIndex;

                if (heap[largeChildIndex] <= temp) break;

                heap[index] = heap[largeChildIndex];
                index = largeChildIndex;
            }
        } else
            while (index < (size / 2)) {
                lcIndex = leftChildIndex(index);
                rcIndex = rightChildIndex(index);

                if (rcIndex < size && heap[lcIndex] > heap[rcIndex]) smallChilIndex = rcIndex;
                else smallChilIndex = lcIndex;

                if (heap[smallChilIndex] >= temp) break;

                heap[index] = heap[smallChilIndex];
                index = smallChilIndex;
            }
        heap[index] = temp;
    }

    void descOrder() {
        for (int i = 0; i < 10; i++) System.out.print(remove() + "\t");
        System.out.println("\n");
    }

    void ascOrder() {
        for (int i = 0; i < 10; i++) System.out.print(remove() + "\t");
        System.out.println("\n");
    }

    void displayHeap() {
        for (int i = 0; i < size; i++) {
            if (heap[i] != Integer.MAX_VALUE) System.out.print(heap[i] + " ");
            else System.out.print("-- ");
        }
        System.out.println();

        int blanks = 32;
        int itemsEachRow = 1;
        int column = 0;
        int current = 0;

        String delimeter = "-----------------------------------------------------------------";
        System.out.println(delimeter);

        while (size > 0) {
            if (column == 0) for (int k = 0; k < blanks; k++) System.out.print(' ');

            System.out.print(heap[current]);

            if (++current == size) break;
            if (++column == itemsEachRow) {
                blanks /= 2;
                itemsEachRow *= 2;
                column = 0;
                System.out.println();
            } else for (int k = 0; k < blanks * 2 - 2; k++) System.out.print(' ');
        }
        System.out.println("\n" + delimeter);
    }
}


