import java.util.*;

public class TwoDArray {

    public static boolean search(int[][] matrix,int key)
    {
        int n=3,m=3;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            {
             if(matrix[i][j]==key)
             {
                System.out.println(key+ " key found at "+i+j);
                return true;
             }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        
        int matrix[][] =new int[3][3];
        int n=3,m=3;
        int key;
        Scanner sc=new Scanner(System.in);

        System.out.println("enter elements of matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("enter key:");
        key=sc.nextInt();

        System.out.println("matrix are:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        search(matrix,key);
    }
    
}
