public class typecast {
    public static void main(String args[])
    {
    
    /*     
        char a='a';
        char b='b';
       // System.out.println(b-a);

       // char c=a-b;-- >lossy conversion error 

       //typecasting
       System.out.println((int)(b));
       System.out.println((int)(a));
    //   System.out.println(a);-->a is printed not the value of a
       System.out.println(b-a);
    */

       byte b=5;
       byte a=(byte)(b*2);
       System.out.println((int)(a));

    }
    
}

/*
  //wrong
  byte b=5;
  b=b*2;
  
  
  //right
  byte b=5;
  b=(byte)(b*2);
 */
