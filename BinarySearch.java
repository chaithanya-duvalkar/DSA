//time complexity-->O(logn)-->n/2  base2
//best-->n/2^k=1
//worst-->logn  (n=2^k)

//binary is better than linear


import java.util.*;

public class BinarySearch {
    public static int binarysearch(int[] numbers,int key,int n){
        int start=0,end=n-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(numbers[mid]==key)
            {
                return mid;
            }
            if(numbers[mid]<key)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,key;
        System.out.println("enter n");
        n=sc.nextInt();
        int[] numbers=new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        Arrays.sort(numbers);
        for(int i=0;i<n;i++){
            System.out.print(numbers[i]+" ");
        }
       
        System.out.println("\nenter key to search");
        key=sc.nextInt();

        int i=binarysearch(numbers,key,n);

        if(i==-1)
        {
            System.out.println("key not found");
        }
        else{
            System.out.println("key "+key+" found at "+i);
        }

    }
    
}
