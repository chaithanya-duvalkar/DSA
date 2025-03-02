//In java strings are IMMUTABLE
//strings cannot be changed


public class String1 {

    public static void printletters(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        
      //  char arr[]={'a','b','c'};
      //  String str="abc";
      //  String str=new String("xyz");

      /* 
        String first_name="Chaithanya";
        String last_name="S Duvalkar";
        
        //concatenation
        String full_name=first_name+" "+last_name;

        //string length
        System.out.println(full_name.length());

        //access letter through index
        System.out.println(full_name.charAt(0));   

        //printletters
        printletters(full_name);

        */

        String s1="chai";
        String s2="chai";
        String s3=new String("chai");

        //for s1 and s2
        if(s1 == s2)
        {
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }

        /* 
        here output will be strings are not equal bcz == operator compares the reference or memory location of objects in heap,
        whether they point to the same location or not
        hence we should use s1.equals(s3) function

        //for s1 and s3
        if(s1 == s3)
        {
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }

        */

        //Here this equals function checks for the actual string content(value) stored are equal or not
        
        if( s1.equals(s3))
        {
             System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }

    }
    
}
