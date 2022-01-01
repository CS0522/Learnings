public class ArrayTest 
{
    public void printArray(int[] ArrayN)
    {
        for (int x:ArrayN)
        {
            System.out.print(x);
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        ArrayTest Obj=new ArrayTest();
        int[] Array1={1,2,3,4,5};
        //int[6] Array2={6,7,8,9,0,1};<--This is wrong
        int[] Array2={6,7,8,9,0,1};
        int Array3[]={3,4,5,6,7,8};
        //int Array4[4]={1,2,3,4};<--This is wrong
        int Array4[]={1,2,3,4};
        int[] Array5=new int[8];
        int i;
        for (i=0;i<8;i++)
        {
            Array5[i]=i;
        }
        System.out.println("Array5:");
        for (i=0;i<8;i++)
        {
            System.out.print(Array5[i]+" ");
        }
        System.out.println();
        System.out.println("Array1:");
        Obj.printArray(Array1);
        System.out.println("Array2:");
        Obj.printArray(Array2);
        System.out.println("Array3:");
        Obj.printArray(Array3);
        System.out.println("Array4:");
        Obj.printArray(Array4);
    }   
}
