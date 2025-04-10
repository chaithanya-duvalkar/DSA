//brute force method to dearch-->row wise and col wise search..O(n^2)
//row wise search-->O(nlogn)
//search matrix also called staircase search
//worst case when n>>m-->O(n)   and when m>>n-->O(m)
//therefore the time complexity of staircase search-->O(n+m)


import java.util.Scanner;

public class SearchMatrix {

    public static boolean staircasesearch(int[][] matrix,int n,int key)
    {
    
    /* 
        //start searching from rightmost value present at the top of matrix

        int row=0;
        int col=n-1;
    
        while(row<n && col>=0)   //(0,m-1)
        {
            if(matrix[row][col]==key)
            {
                System.out.println(key+" key found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col])   //key<cell value
            {
                col--;    //left
            }
            else
            {
                row++;     //bottom
            }

        }
            
        System.out.println("key not found");
        return false;

        */


        //start searching from leftmost value present at the bottom of matrix

        int row=n-1;
        int col=0;

        while( row>=0 && col<n-1 )
        {
            if(matrix[row][col]==key)
            {
                System.out.println(key+" key found at ("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col])
            {
                row--;      //top
            }
            else{
                col++;      //right
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
