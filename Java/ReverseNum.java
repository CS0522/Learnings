import java.util.Scanner;
public class ReverseNum 
{
    public int x;
    public void get_x()
    {
        System.out.println("Input the number you want to reverse: ");
        Scanner scan=new Scanner(System.in);
        if (scan.hasNextInt())
        {
            x=scan.nextInt();
        }
        scan.close();
    }
    public void reverse_x()
    {
        int n;
        int sum=0;
        n=Math.abs(x);
        for (;n>0;)
        {
            sum=sum*10+n%10;
            n/=10;
        }
        if (x>=0)
        {
            System.out.println("The reverse number is: "+sum);
        }
        else if (x<0)
        {
            System.out.println("The reverse number is: -"+sum);
        }
    }
    public static void main(String[] args)
    {
        ReverseNum obj=new ReverseNum();
        obj.get_x();
        obj.reverse_x();
    }
}
