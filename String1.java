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
    }
    
}
