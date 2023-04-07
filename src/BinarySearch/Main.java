package BinarySearch;

import java.util.Scanner;

// Di sini akan dijelaskan bagaimana algoritma dan jalan kerjanya Array Binary Searching pada Java.
// Binary Search ini bekerja dengan cara mencari nilai tengah dari 2 titik, yaitu "first" dan "end"
// dengan cara membagi 2. Apabila nilai tengah ini adalah key-value yang dicari, maka itu jawaban
// yang dijadikan output
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number of array elements : ");
        int data = scanner.nextInt(); 
        // Input berapa besar size (banyak element) pada Array
        
        int[] array = new int[data];
        // Masukkan size dalam ke dalam Array
        int rear = array.length - 1;
        // Inisialisasikan Rear (end) atau element terakhir dalam Array, yaitu Array.length() - 1.
        // Mengapa Array.length() - 1? Karena saat kita berbicara Array.length, maka artinya panjang
        // Array nya ada berapa, yaitu 13. Namun apabila kita berbicara index array, maka dimulai dari 0 
        // hingga Array.length() - 1.
        int index;

        for (index = 0; index < data; index++) {
            System.out.println("Enter elements : ");
            int element = scanner.nextInt();
            // Lakukan for loop dari index 0 sampai index 12, lalu input key-value (element) dari value 
            // ke-0 sampai value di index ke-12.
        }
        System.out.print("Enter target number : ");
        int target = scanner.nextInt();
        // Target number adalah key-value yang ingin kita cari dalam Array
        
        int result = binarySearch(array, 0, rear, target);
        
        if (result == -1)
            System.out.println(target + " is not found!"); // If element isn't found
        else
            System.out.println(" is found at index" + index); // If element is found
    }

    private static int binarySearch(int[] arr, int first, int rear, int target) {
        if (rear >= first) {
            int mid = arr.length / 2;
            // Apabila diketahui Rear lebih besar daripada First, maka Array.length akan dibagi 2
            if (arr[mid] == target)
                return mid; // Kalau nilai tengah = target value, return nilai tersebut karena itu jawabannya

            if (arr[mid] > target) {
                return binarySearch(arr, first, mid - 1, target);
                // Kalau ternyata nilai tengah lebih besar daripada target value, return method dengan
                // syarat Rear = mid-1
            }
            else return binarySearch(arr, mid + 1, rear, target); 
            // Kalau ternyata nilai tengah lebih kecil daripada target value, return method dengan
            // syarat First = mid+1
        }
        return -1;
    }
}
