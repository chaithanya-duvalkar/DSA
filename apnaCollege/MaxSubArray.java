//time complexity-->O(n^3)-->brute force approach


import java.util.Scanner;

public class MaxSubArray {

    public static void maxsubarraysum(int[] array,int n)
    {
        int max_sum=Integer.MIN_VALUE;
        int cur_sum=0;


        for(int i=0;i<n;i++){
              int start=i;
              for(int j=i;j<n;j++){
                cur_sum=0;
                int last=j;
                for(int k=start;k<=last;k++)
                {
                   cur_sum+=array[k];      //calculates the sum of the elements of array
                }
                System.out.println(cur_sum);
                if(max_sum<cur_sum){
                    max_sum=cur_sum;
                }
              }
        }
        System.out.println("MaxSubarraySum:"+max_sum);
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

        maxsubarraysum(array,n);
    }
}
