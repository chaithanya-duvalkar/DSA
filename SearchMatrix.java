//brute force method to dearch-->row wise and col wise search..O(n^2)
//row wise search-->O(nlogn)
//search matrix also called staircase search
//worst case when n>>m-->O(n)   and when m>>n-->O(m)
//therefore the time complexity of staircase search-->O(n+m)


import java.util.Scanner;

public class SearchMatrix {

    public static boolean staircasesearch(int[][] matrix,int n,int key)
    {
        int row=0;
        int col=n-1;

        while(row<n && col>=0)
        {
            if(matrix[row][col]==key)
            {
                System.out.println(key+" key found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }

        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter m");
        int m=sc.nextInt();
        int matrix[][] =new int[n][m];
      

        System.out.println("enter elements of matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
       
        System.out.println("matrix are:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("enter key");
        int key=sc.nextInt();

        staircasesearch(matrix, n, key);
    }
    
}
