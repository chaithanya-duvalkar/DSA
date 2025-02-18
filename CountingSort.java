

//used for positive numbers and small numbers like rollno. student marks etc

import java.util.Scanner;

public class CountingSort {
    
    public static void countingsort(int[] array,int n){
     
        int largest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            largest=Math.max(largest,array[i]);
        }

        //counting frequency
        int count[]=new int[largest+1];
        for(int i=0;i<n;i++)
        {
            count[array[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0;i<count.length;i++)
        {
            while(count[i]>0)
            {
                array[j]=i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printarray(int[] array,int n)
    {
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter n");
        n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        } 

        countingsort(array,n);
        printarray(array,n);
        
    }
}
