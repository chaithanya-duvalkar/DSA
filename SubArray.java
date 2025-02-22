//total subarrays calculated-->sum of n numbers-->n(n+1)/2


import java.util.Scanner;

public class SubArray {

    public static void printsubarray(int[] array,int n)
    {
        int count=0;
        for(int i=0;i<n;i++){
              int start=i;
              for(int j=i;j<n;j++){
                int last=j;
                for(int k=start;k<=last;k++)
                {
                    System.out.print(array[k]+" ");
                }
                System.out.println();
                count++;
              }
              System.out.println();
        }
        System.out.println("total subarrays:"+count);
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

        printsubarray(array,n);
    }
}
