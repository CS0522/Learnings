/*class SuperClass
{
    private int n;
    SuperClass()
    {
        System.out.println("SuperClass()");
    }
    SuperClass(int n)//Override
    {
        System.out.println("SuperClass(int n)");
        this.n=n;
    }
}
//Derive Class-----SubClass 
class SubClass extends SuperClass
{
    private int n;
    SubClass()
    {
        System.out.println("SubClass");//no parameter constructor

    }
    SubClass(int n)
    {
        super(300);//parameter constructor
        System.out.println("SubClass(int n)");
        this.n=n;
    }
}
public class TestDerive
{
    public static void main(String[] args)
    {
        SubClass obj1=new SubClass();
        SubClass obj2=new SubClass(200);
    }
}
*/