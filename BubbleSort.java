//time complexity-->O(n^2)
//in bubble sort the largest element in the array is bubbled up and sent to the end of the array

import java.util.Scanner;

public class BubbleSort {
    
    public static void bubblesort(int[] array,int n){
        int swap=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swap++;
                } 
            }
        }
        System.out.println("no. of swap="+swap);
    }

    public static void printarray(int[] array,int n){
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter n");
        n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        } 

        bubblesort(array,n);
        printarray(array,n);
        
    }
}
