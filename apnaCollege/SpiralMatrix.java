import java.util.Scanner;

public class SpiralMatrix {

    public static void printspiral(int[][] matrix,int n,int m)
    {
        int startRow=0;
        int startCol=0;
        int endRow=n-1;
        int endCol=m-1;

        while(startRow<=endRow && startCol<=endCol)
        {
             //top
            for(int j=startCol;j<=endCol;j++)      // ---->
            {
             System.out.print(matrix[startRow][j]+" ");
            }

            //right                                    
            for(int i=startRow+1;i<=endRow;i++) 
            {
                System.out.print(matrix[i][endCol]+" ");
            }

            //bottom                               //<----
            for(int j=endCol-1;j>=startCol;j--)
            {
                if(startCol==endCol)
                    break;
                System.out.print(matrix[endRow][j]+" ");    
            }

            //left
            for(int i=endRow-1;i>=startRow+1;i--)
            {
                if(startCol==endCol)
                {
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;

        }
       
    }
    public static void main(String args[]){
        
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
        printspiral(matrix,n,m);
    }
    
}


    
