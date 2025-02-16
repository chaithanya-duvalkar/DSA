//time complexity-->O(n)

import java.util.Scanner;

public class SellStock {

    public static int buyandsellstock(int[] stocks,int n)
    {
        int buyprice=Integer.MAX_VALUE;
        int max_profit=0;

        for(int i=0;i<n;i++){
            
            if(buyprice<stocks[i]){   //profit
                int profit=stocks[i]-buyprice;   //today's profit
                max_profit=Math.max(profit,max_profit);
            }
            else{
                buyprice=stocks[i];    //no profit
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter n");
        n=sc.nextInt();
        int[] stocks=new int[n];   //prices
        System.out.println("enter array");
        for(int i=0;i<n;i++){
            stocks[i]=sc.nextInt();
        }

        System.out.println(buyandsellstock(stocks,n));
    }
    
}
