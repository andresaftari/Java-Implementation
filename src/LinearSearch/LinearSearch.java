package LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of elements : ");
        int arrays = scanner.nextInt(); // Enter how many elements
        int[] arr = new int[arrays];

        int index;

        for (index = 0; index < arrays; index++) {
            System.out.println("Enter the elements : ");
            arr[index] = scanner.nextInt(); // Enter elements
        }

        System.out.print("Target number : ");
        int target = scanner.nextInt(); // Enter target number

        for (index = 0; index < arrays; index++) {
            if (arr[index] == target) {
                System.out.println(target + " is in index " + index);
                break;
            }
        }
        if (index == arrays)
            System.out.println(target + " is not found!");
    }
}
