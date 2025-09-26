import java.util.Scanner;

public class pblm1 {
    public static int count7(int[][] matrix,int n,int m)
    {
        int count=0;
        int k=7;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==k)
            {
                count++;
            }
            }
        }
        return count;
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
        int count=count7(matrix, n,m);

        System.out.println("no. of 7:"+count);


    }
}
