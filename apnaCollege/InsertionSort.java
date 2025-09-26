//time complexity-->O(n^2)
//dividing the array as sorted part and unsorted part

import java.util.*;

public class InsertionSort {
    public static void insertionSort(int[] array, int n) {
        int swap = 0;
        for (int i = 1; i < n; i++) {
            int current = array[i];
            int prev = i - 1;

            // Finding the correct position
            while (prev >= 0 && array[prev] > current) // Change '>' to '<' for descending order
            { 
                array[prev + 1] = array[prev];
                prev--;
              //  swap++; // Counting shifts
            }

            // Insertion
            array[prev + 1] = current;
        }
        
      //  System.out.println("\nNumber of shifts = " + swap);
    }

    public static void printArray(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Newline after printing
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        } 
        sc.close(); // Closing scanner to prevent resource leak

        insertionSort(array, n);
        printArray(array, n);
    }
}
