
//List of elements of the same type placed in a contiguous memory location


//call by reference
public class Array1 {

    public static void update(int[] marks, int nonchangable){
        nonchangable=5;
        for(int i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int[] marks={97,92,99};
        int nonchangable=5;
        update(marks,nonchangable);
        System.out.println(nonchangable);

        for(int i=0;i<marks.length;i++)
        {
            System.out.print(marks[i]+" ");
        }

    }
    
}
