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

        /*
        //"==" & "equals()"

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

        

        //Here this equals function checks for the actual string content(value) stored are equal or not

        if( s1.equals(s3))
        {
             System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }

        */

        /* 
        //access substring using substring()
        String str="chaithanya Duvalkar";
        System.out.println(str.substring(11,19));

        */

        /* 
        //to print the largest string from a given set of strings
        //time complexity-->O(x*N)

        String names[]={"putti","ishwara","geetha","thammu","ammi","chukki"};

        String largest=names[0];

        for(int i=1;i<names.length;i++)
        {
            if(largest.compareTo(names[i]) < 0)
            {
                largest=names[i];
            }
        }
        System.out.println(largest);

        */

        /* 
        //stringbuilder
        StringBuilder sb= new StringBuilder("");

        for(char ch='a';ch<='z';ch++)
        {
            sb.append(ch);
        }

        System.out.println(sb);

        */


       
    }
    
}
