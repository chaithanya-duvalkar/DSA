import java.util.Scanner;

public class pblm2 {

    public static int sumsecondrow(int[][] matrix,int n,int m)
    {
        int sum=0;
        int i,j;

        for(j=0;j<m;j++)
        {
            sum+=matrix[1][j];
        }

    /*  for(i=1;i<2;i++)
        {
            for(j=0;j<m;j++)
            {
                sum+=matrix[i][j];
            }
        }
            */
        return sum;
    }

     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter n");
        n=sc.nextInt();
        int m;
        System.out.println("enter n");
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
        int sum=sumsecondrow(matrix, n,m);

        System.out.println("sum of second row:"+sum);


    }
    
}
