//for a given string convert the first letter of each word into uppercase

public class FirstLUpper {
    public static void main(String args[])
    {
        String str="hey..! my name is chaithanya duvalkar";
        StringBuilder sb=new StringBuilder("");

        //first letter converting into uppercase
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++)
        {
            if(str.charAt(i) == ' ' && i < str.length())
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(str);
        System.out.println(sb);

    }
}
