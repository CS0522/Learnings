package Operator;

public class BitOperator 
{
    public void operatorTest()
    {
        int a=60;//a = 0011 1100
        int b=13;//b = 0000 1101
        int c=0;
        c=a&b;//a&b=0000 1100, c=12
        System.out.println("a & b = "+c);
        c=a|b;//a|b=0011 1101
        System.out.println("a | b = "+c);
        c=a^b;//a^b=0011 0001
        System.out.println("a ^ b = "+c);
        c=~a;//~a=-61=1100 0011
        System.out.println("~a = "+c);
        c=a<<2;//0011 1100<<2=1111 0000
        System.out.println("a << 2 = "+c);
        c=a>>2;//0011 1100>>2= 1111
        System.out.println("a >> 2  = "+c);
        c=a>>>2;//0011 1100>>>2=0000 1111
     System.out.println("a >>> 2 = "+c);
    }
    public static void main(String[] args)
    {
        BitOperator Obj= new BitOperator();
        Obj.operatorTest();
    }
}
