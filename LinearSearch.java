
//time complexity-->n
public class LinearSearch {

    public static int linearsearch(int[] numbers,int key)
    {
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers={2,8,9,10,15};
        int key=4;

        int i=linearsearch(numbers,key);

        if(i==-1)
        {
            System.out.println("key not found");
        }
        else{
            System.out.println("key "+key+ " found at "+i);
        }

    }
    
}
