
public class LargestNo {
    public static int largest(int numbers[]){
        int largest=Integer.MIN_VALUE;
      //  int smallest=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>largest){
                largest=numbers[i];
            }
          /*   if(smallest>numbers[i])
            {
                smallest=numbers[i];
            }
        */    
        }
        return largest;
       // return smallest;
    }
    public static void main(String[] args) {
        int[] numbers={5,4,9,2,1};

        int largest=largest(numbers);

        System.out.println("largest="+largest);

    }
    
}
