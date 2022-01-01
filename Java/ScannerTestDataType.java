import java.util.Scanner;
public class ScannerTestDataType 
{
    public static void main(String[] args)
    {
        int a;
        float b;
        double c;
        Scanner scan=new Scanner(System.in);
        System.out.println("Input an integer: ");
        a=scan.nextInt();//pay attention, you can only use .nextInt() for integer, .next()(only for string) is not allowed.
        System.out.println("Input a float: ");
        b=scan.nextFloat();//so is the nextFloat().
        System.out.println("Input a double: ");
        c=scan.nextDouble();//so is the nextDouble().
        System.out.println("a = "+a+" b = "+b+" c = "+c);
        scan.close();
    }
}
