 //string compression
 
 public class StringCompression{
    public static void main(String[] args)
    {
        String str="aaabbccccddd";

        String newStr="";

        for(int i=0;i<str.length();i++)
        {
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }
            newStr+=str.charAt(i);

            if(count>1)
            {
                newStr+=count.toString();
            }
        }

        System.out.println(str);
        System.out.println(newStr);
    }
}