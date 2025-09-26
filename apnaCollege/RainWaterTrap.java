//trap rain water
//time complexity-->O(n)

import java.util.Scanner;

public class RainWaterTrap {
    
    public static int trappedrainwater(int[] height,int n)
    {

        //calculate left max boundary
        int[] left_max=new int[n];
        left_max[0]=height[0];   //first element

        //calculating from first
        for(int i=1;i<n;i++){
            left_max[i]=Math.max(height[i],left_max[i-1]);
        }

        //calculate right max boundary
        int[] right_max=new int[n];
        right_max[n-1]=height[n-1];     //last element

        //calculating from last
        for(int i=n-2;i>=0;i--)
        {
            right_max[i]=Math.max(height[i],right_max[i+1]);
        }

        //loop
        int trappedwater=0;
        for(int i=0;i<n;i++){

            //waterlevel=min(left_max bound,right_max bound)
            int waterlevel=Math.min(left_max[i],right_max[i]);

            //trapped water=waterlevel-height[i]
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
    }

    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter n");
        n=sc.nextInt();
        int[] height=new int[n];
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }

        System.out.println(trappedrainwater(height,n));
    }
}
