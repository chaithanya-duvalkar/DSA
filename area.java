import java.util.*;

public class area {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius:");
        int r=sc.nextInt();    //float r=sc.nextFloat();
        double area=3.14*r*r;  //float area=3.14f*r*r;
        System.out.println("area of the circle with radius "+r+" is "+area);

    }
    
}
