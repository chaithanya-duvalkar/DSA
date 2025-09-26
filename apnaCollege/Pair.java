
//we can calculate total pairs-->(n(n-1))/2
//time complexity-->O(n^2)
//worst case->outer loop O(n) and inner loop O(n^2)

import java.util.*;

public class Pair {
    public static void printpairs(int[] array,int n)
    {
        int count=0;
        for(int i=0;i<n;i++){
            int current=array[i];
            for(int j=i+1;j<n;j++)
            {
                System.out.print("("+current+","+array[j]+")");
                count++;
            }
            System.out.println();
        }
        System.out.println("total pairs:"+count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter n:");
        n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        printpairs(array,n);

    }
    
}
