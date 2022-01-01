import java.util.Scanner;
public class ScannerTest 
{
    public static void main(String[] args)
    {
        System.out.println("Input a string:(by 'next()' pattern) ");
        Scanner scan_test1=new Scanner(System.in);//Create an object of the class.
        String str1=scan_test1.next();
        System.out.println("Output the string: "+str1);
        //scan_test.close();//Pay attention to this, only type this sentence when after the last next or nextLine sentence.
        System.out.println("Input a string:(by 'nextline' pattern) ");
        Scanner scan_test2=new Scanner(System.in);
        String str2=scan_test2.nextLine();
        System.out.println("Output the string: "+str2);
        scan_test1.close();
        scan_test2.close();
    }    
}
