//time complexity-->O(n^2)-->more optimised prefix sum
//time complexity is less than maxsubarray which has 3 loops O(n^3)


import java.util.Scanner;

public class PrefixSum {

    public static void prefixsum(int[] array,int n)
    {
        int max_sum=Integer.MIN_VALUE;
        int cur_sum=0;
        int[] prefix=new int[n];

        //prefix array
        prefix[0]=array[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+array[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(prefix[i]+" ");
        }
        System.out.println();
        //prefix sum calculation

        for(int i=0;i<n;i++){
              int start=i;
              for(int j=i;j<n;j++){
                int end=j;

                //if start index is 0 then sum calculated till end if not 
                //prefix formula applied to calculate sum of subarray 
                cur_sum=start==0?prefix[end]:prefix[end]-prefix[start-1];
                

              //  System.out.println(cur_sum);-->not required
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

        prefixsum(array,n);
    }
}
