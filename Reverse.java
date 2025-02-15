//time complexity-->n
//space complexity-->constant 1


import java.util.Scanner;

public class Reverse {
    public static void reverse(int[] array,int n)
    {
        int start=0,end=n-1;
        while(start<end)
        {
            int temp=array[end];
            array[end]=array[start];
            array[start]=temp;

            start++;
            end--;
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

        reverse(array,n);

        System.out.println("after reversing");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
    }
} 
