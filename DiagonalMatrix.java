import java.util.*;

public class DiagonalMatrix 
{

    public static int diagonalmatrix(int[][] matrix,int n)
    {
         int sum=0;

   /*       
         for(int i=0;i<n;i++)        //time complexity--->O(n^2)
         {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                {
                    sum+=matrix[i][j];
                }
                if(i+j==n-1)
                {
                    sum+=matrix[i][j];
                }

            }
         }
         return sum;
         
*/
         for(int i=0;i<n;i++)      //time complexity--->O(n)
        {
            //primary diagonal
            sum+=matrix[i][i];

            //secondary diagonal
            if(i!=n-1-i){
                sum+=matrix[i][n-i-1];
            }
        }
        return sum;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n");
        int n=sc.nextInt();
        System.out.println("enter m");
        int m=sc.nextInt();
        
        int[][] matrix =new int[n][m];

        System.out.println("enter elements of matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
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

        int sum=diagonalmatrix(matrix,n);
        System.out.println("diagonal matrix sum:"+sum); 
        

}
}
