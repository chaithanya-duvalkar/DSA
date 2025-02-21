import java.util.Scanner;

public class pblm3 {
    public static void transpose(int[][] matrix,int row,int col)
    {
        int[][] transpose=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            {
               transpose[j][i]=matrix[i][j];
            }
        }
        System.out.println("transpose matrix:");
        for(int i=0;i<col;i++){
            for(int j=0;j<row;j++)
            {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter n");
        n=sc.nextInt();
        int m;
        System.out.println("enter m");
        m=sc.nextInt();
        int[][] matrix=new int[n][m];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();
        transpose(matrix, n,m);

    }
}
