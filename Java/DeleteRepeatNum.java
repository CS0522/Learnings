import java.util.Scanner;
public class DeleteRepeatNum 
{
    int[] array;
    DeleteRepeatNum()  //constructor
    {
        array=new int[10];
        System.out.println("Input the values: ");
        Scanner scan=new Scanner(System.in);
        int i=0;
        int temp=0;
        if (scan.hasNextInt())
        {
            temp=scan.nextInt();
        }
        while (i!=10)
        {
            array[i]=temp;
            i++;
            if (scan.hasNextInt())
            {
                temp=scan.nextInt();
            }
        }
        scan.close();
    }
    public void delete_func()
    {
        int count=0;
        for (int i=0;i<10;i++)
        {
            for (int j=i+1;j<10;j++)
            {
                if (array[i]==array[j])
                {
                    array[j]=-1;
                    count++;
                }
            }
        }
        int new_size=array.length-count;
        System.out.println("The size of new array is: "+new_size);
        for (int x:array)
        {
            if (x!=-1)
            {
                System.out.print(x+" ");
            }
            else
            {
                continue;
            }
        }
    }
    public static void main(String[] args)
    {
        DeleteRepeatNum obj=new DeleteRepeatNum();
        obj.delete_func();
    }
}
