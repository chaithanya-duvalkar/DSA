import java.util.*;

public class BitManipulation {
    // public static void main(String args[])
    // {
    //     Scanner sc=new Scanner(System.in);
    //     int a=sc.nextInt();
    //     // int b=sc.nextInt();

    //     int n=sc.nextInt();
    //     int i=sc.nextInt();
    //     int j=sc.nextInt();
 
    //     //Binary AND
    //     // System.out.println("AND OP:"+(a & b));
        
    //     //Binary OR
    //     // System.out.println("OR OP:"+(a | b));
        
    //     //Binary XOR
    //     // System.out.println("XOR OP:"+(a ^ b));

    //     //Binary 1's complement
    //     System.out.println(~a);
    //     //LSB-->odd or even
    //     //MSB-->+/- number

    //     // 5->00000101
    //     // ~->11111010  here MSB is -ve hence one's complement
           
    //     //    00000101  then add 1 to the result i.e., 2's complement
    //     //          +1
    //     //    00000110 == 6  but we took 2's complement hence the answer is written in negative
    //     //    therefore the negation of 5 is -6

    //     // ~0->1 but we get -1 (same procedure as ~5)


    //     //Binary Left Shift
    //     // 5<<2
    //     // 5-->000101
    //     //   (010100)base2 -->20  
    //     System.out.println(5<<2); //a<<b=a*2^b

    //     //Binary Right Shift
    //     // 6>>1
    //     // 6-->000110
    //     //     (000011)base2-->3
    //     System.out.println(6>>1); //a>>ba/2^b


    //     //check if a number is odd or even
    //     // check 3-> 011
    //     //          &001
    //     //           001 -->(1)odd 
    //     // check 4-> 100
    //     //          &001
    //     //           000 -->(0)even          
    //     oddOrEven(a);

    //     // 00001111 we need ith position i.e.,i=2
    //     // 00000100 left shift of 1 ->(1<<2)
    //     // &
    //     // 00000100 ->result due to & operation
    //     // therefore ith bit is 1
    //     System.out.println(getIthBit(a, i));

    //     // n=1010(18)   set second bit i=2
    //     //   0100 -->(1<<2)
    //     //   1110 -->(12) n|(1<<2)
    //     System.out.println(setIthBit(a, i));

    //     // 10= 1010  i=1
    //     //     0010  (1<<i)
    //     //     1101 ~(1<<i)
    //     // result->1000 (8)  & operation of 1010 and 1101
    //     System.out.println(clearIthBit(a, i));

    //     System.out.println(updateIthBit(a,n,i));

    //     // n=1111 (15), i=2
    //     // result=1100 (12)
    //     // n & ((-1)<<i) --> 1111
    //     //                 & 1100  -->(-1)<<i or ~0<<i
    //     //                   1100
    //     System.out.println(clearIBits(n, i));

    //     // n=100111010011 i=2 j=7
    //     // result=100100000011  -->n&(a|b)
    //     //          n-->100111010011
    //     //      &operation  j    i
    //     //              111100000011 -->bitMask is a|b
    //     //              a=111100000000 -->(~0)<<(j+1)
    //     //              b=000000000011 -->(1<<i)-1
    //     System.out.println(clearBitsinRange(n, i, j));

    //     // 16->10000  n     first bit one followed by all zeros
    //     // 15->01111  n-1   first bit 0 followed by one's
    //     // & ->00000
    //     System.out.println(isPowerofTwo(n));

    //     setCountBits(n);

    //     System.out.println(fastExpo(a, n));
    // }

    // public static int getIthBit(int n,int i)
    // {
    //     int bitMask = 1<<i;
    //     if((n & bitMask) == 0)  //n&(1<<i)
    //     {
    //         return 0;
    //     }
    //     else 
    //     {
    //         return 1;
    //     }
    // }

    // public static int setIthBit(int n,int i)
    // {
    //     int bitMask=1<<i;
    //     return n|bitMask;
    // }

    // public static int clearIthBit(int n,int i)
    // {
    //     int bitMask=1<<i;
    //     return (n&(~bitMask));
    // }

    // public static int updateIthBit(int n,int i,int newBit)
    // {
    //     // if(newBit == 0)
    //     // {
    //     //     return clearIthBit(n, i);
    //     // }
    //     // else 
    //     // {
    //     //     return setIthBit(n, i);
    //     // }

    //     n=clearIthBit(n, i);
    //     int BitMask =newBit<<i;
    //     return n|BitMask;
    // }

    // public static int clearIBits(int n,int i)
    // {
    //     int bitMask=(~0)<<i;  //(-1)<<i
    //     return n & bitMask;
    // }

    // public static int clearBitsinRange(int n,int i,int j)
    // {
    //     int a=(~0)<<(j+1);
    //     int b=(1<<i)-1;
    //     int bitMask=a|b;
    //     return n & bitMask;

    //     // ex: (10) 0001010  i=2  j=4
    //     //       &  1100010
    //     //  result->0000010  (2)
    // }

    // public static boolean isPowerofTwo(int n)
    // {
    //     return (n&(n-1))==0;

    //     // ex:(n=4) 100
    //     //   n-1=3  011
    //     //     &    000

    //     // ex:(n=15) 1111
    //     // n-1=14    1110
    //     //  &        1110
    // }

    // public static void setCountBits(int n)
    // {
    //     int count=0;
    //     while(n>0)
    //     {
    //         if((n&1) != 0)  //check for LSB
    //         {
    //             count++;
    //         }
    //         n=n>>1;
    //     }
    //     System.out.println("count of 1's:"+count);
    // }

    // public static int fastExpo(int a,int n)
    // {
    //     int ans=1;
    //     while(n>0)
    //     {
    //         if((n&1)!=0)
    //         {
    //             ans=ans*a;
    //         }
    //         a=a*a;
    //         n=n>>1;
    //     }
    //     return ans;
    // }

    // public static void oddOrEven(int n)
    // {
    //     int bitMask = 1;

    //     if((n & bitMask) == 0)
    //     {
    //         System.out.println("Number is even");
    //     }
    //     else 
    //     {
    //         System.out.println("Number is odd");
    //     }
    // }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println("before swap:"+ x +" and "+ y);

        x=x^y;      
        y=x^y;
        x=x^y;

        System.out.println("after swap:"+ x +" and "+ y);

        // x=1->01
        // y=2->10
        // x^y->11=x 
        // x^y->01=y->1 
        // x^y->10=x->2

    }
}
