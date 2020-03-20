package BinarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of array elements : ");
        int data = scanner.nextInt(); // How many array elements?

        int[] array = new int[data];
        int rear = array.length - 1; // Rear is array.length()-1
        int index;

        for (index = 0; index < data; index++) {
            System.out.println("Enter elements : ");
            int element = scanner.nextInt(); // Enter elements
        }
        System.out.print("Enter target number : ");
        int target = scanner.nextInt(); // Enter the target number

        int result = binarySearch(array, 0, rear, target); // Call binarySearch method

        if (result == -1)
            System.out.println(target + " is not found!"); // If element isn't found
        else
            System.out.println(" is found at index" + index); // If element is found
    }

    private static int binarySearch(int[] arr, int first, int rear, int target) {
        if (rear >= first) {
            int mid = arr.length / 2; // If rear is bigger than first, array.length() / 2
            if (arr[mid] == target)
                return mid; // If middle is the same as target number, return it!

            if (arr[mid] > target)
                // If mid number is bigger than target, return method with rear == mid-1
                return binarySearch(arr, first, mid - 1, target);
                // If different than any before, return method with first == mid+1
            else return binarySearch(arr, mid + 1, rear, target);
        }
        return -1;
    }
}
