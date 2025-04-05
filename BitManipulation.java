import java.util.*;

public class BitManipulation {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        // int b=sc.nextInt();
        int i=sc.nextInt();
 
        int n=sc.nextInt();
        //Binary AND
        // System.out.println("AND OP:"+(a & b));
        
        //Binary OR
        // System.out.println("OR OP:"+(a | b));
        
        //Binary XOR
        // System.out.println("XOR OP:"+(a ^ b));

        //Binary 1's complement
        System.out.println(~a);
        //LSB-->odd or even
        //MSB-->+/- number

        // 5->00000101
        // ~->11111010  here MSB is -ve hence one's complement
           
        //    00000101  then add 1 to the result i.e., 2's complement
        //          +1
        //    00000110 == 6  but we took 2's complement hence the answer is written in negative
        //    therefore the negation of 5 is -6

        // ~0->1 but we get -1 (same procedure as ~5)


        //Binary Left Shift
        // 5<<2
        // 5-->000101
        //   (010100)base2 -->20  
        System.out.println(5<<2); //a<<b=a*2^b

        //Binary Right Shift
        // 6>>1
        // 6-->000110
        //     (000011)base2-->3
        System.out.println(6>>1); //a>>ba/2^b


        //check if a number is odd or even
        // check 3-> 011
        //          &001
        //           001 -->(1)odd 
        // check 4-> 100
        //          &001
        //           000 -->(0)even          
        oddOrEven(a);

        // 00001111 we need ith position i.e.,i=2
        // 00000100 left shift of 1 ->(1<<2)
        // &
        // 00000100 ->result due to & operation
        // therefore ith bit is 1
        System.out.println(getIthBit(a, i));

        // n=1010(18)   set second bit i=2
        //   0100 -->(1<<2)
        //   1110 -->(12) n|(1<<2)
        System.out.println(setIthBit(a, i));

        // 10= 1010  i=1
        //     0010  (1<<i)
        //     1101 ~(1<<i)
        // result->1000 (8)  & operation of 1010 and 1101
        System.out.println(clearIthBit(a, i));

        System.out.println(updateIthBit(a, i,n));
    }

    public static int getIthBit(int n,int i)
    {
        int bitMask = 1<<i;
        if((n & bitMask) == 0)  //n&(1<<i)
        {
            return 0;
        }
        else 
        {
            return 1;
        }
    }

    public static int setIthBit(int n,int i)
    {
        int bitMask=1<<i;
        return n|bitMask;
    }

    public static int clearIthBit(int n,int i)
    {
        int bitMask=1<<i;
        return (n&(~bitMask));
    }

    public static int updateIthBit(int n,int i,int newBit)
    {
        // if(newBit == 0)
        // {
        //     return clearIthBit(n, i);
        // }
        // else 
        // {
        //     return setIthBit(n, i);
        // }

        n=clearIthBit(n, i);
        int BitMask =newBit<<i;
        return n|BitMask;
    }

    public static void oddOrEven(int n)
    {
        int bitMask = 1;

        if((n & bitMask) == 0)
        {
            System.out.println("Number is even");
        }
        else 
        {
            System.out.println("Number is odd");
        }
    }
}
