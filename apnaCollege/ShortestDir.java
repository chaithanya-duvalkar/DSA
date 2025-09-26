/*
Given a route containing 4 directions (E,W,S,N), find the shortest path to reach destination.
Ex:"WNEENESENNN"

*/

import java.util.*;

public class ShortestDir {

    public static float shortestdirection(String path)
    {
        int x=0,y=0;
        for(int i=0;i<path.length();i++)
        {
            char dir=path.charAt(i);

            if(dir == 'S')
            {
                y--;
            }
            else if(dir == 'N')
            {
                y++;
            }
            else if(dir == 'W')
            {
                x--;
            }
            else 
            {
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;

     return (float)Math.sqrt(X2+Y2);
    }
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter direction");
        String path=sc.nextLine();

        float k=shortestdirection(path);
        System.out.println("shortest direction:"+k);

    }
}
