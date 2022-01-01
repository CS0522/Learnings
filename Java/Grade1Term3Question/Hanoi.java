/*
moving main function:
x,y,z poles. n disks.
1.Move n-1 disks from x to the y pole;
2.Move 1 disk to the z pole;
3.Move n-1 disks from y to z pole.
*/
package Grade1Term3Question;
import java.util.Scanner;
public class Hanoi 
{
    public void moveDisk(int n, char x, char y, char z)
    {
        if (n==1)
        {
            System.out.println("The "+n+" disk: from "+x+" to "+z+" pole. ");
        }
        else
        {
            moveDisk(n-1,x,z,y);
            System.out.println("The "+n+" disk: from "+x+" to "+z+" pole. ");
            moveDisk(n-1,y,x,z);
        }
    }
    public int totalStep(int n)
    {
        if (n==1)
        {
            return 1;
        }
        else
        {
            return 2*totalStep(n-1)+1;
        }
    }
    public static void main(String[] args)
    {
        Hanoi obj=new Hanoi();
        System.out.println("Input the amount of the disk: ");
        int ndisk=0;
        Scanner scan=new Scanner(System.in);
        if (scan.hasNextInt())
        {
            ndisk=scan.nextInt();
        }
        scan.close();
        int totalstep=obj.totalStep(ndisk);
        System.out.println("You should go "+totalstep+"steps to get disks from A to C pole. ");
        System.out.println("The each step is as follows: ");
        obj.moveDisk(ndisk,'A','B','C');
    } 
}
