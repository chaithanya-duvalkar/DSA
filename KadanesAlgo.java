//simplified version of brute force maxarraysum
//only one for loop-->time complexity-->O(n)

import java.util.Scanner;

public class KadanesAlgo {
    public static void kadanessum(int[] array,int n)
    {
        int max_sum=Integer.MIN_VALUE;
        int current_sum=0;

        for(int i=0;i<n;i++){
            current_sum=current_sum+array[i];

            if(current_sum<0)      //if cs is negative then it is considered as zero
            {
                current_sum=0;
            }
            max_sum=Math.max(current_sum,max_sum);
        }
        System.out.println("max_sum="+max_sum);
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

        kadanessum(array,n);
    }

}
