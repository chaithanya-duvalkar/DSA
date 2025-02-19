//time complexity-->O(n^2)
//in selection sort the smallest element is picked and sent to the start index of the array
//the first element is considered as smallest element and compared with next elements


import java.util.*;

public class SelectionSort {
    
    public static void selectionsort(int[] array,int n){
        int swap=0;

        for(int i=0;i<n-1;i++){
            int minPos=i;  //storing index not the value
            for(int j=i+1;j<n;j++){
                //loop
                if(array[minPos]>array[j])   // Change '>' to '<' for descending order
                {
                    minPos=j;
                }
            }
            //swap
            if(minPos!=i){
                int temp=array[minPos];
                array[minPos]=array[i];
                array[i]=temp;
            //    swap++;
            }
          
        }
    //   System.out.println("no. of swap="+swap);
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

        selectionsort(array,n);
        printarray(array,n);
        
    }
}

