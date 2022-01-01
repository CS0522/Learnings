public class UseOfVariable
{
    public static String Name = "Frank";//public static variable
    private static int Age = 19;//private static variable
    public String School = "Dalian University of Technology";//public instance variable
    public void printInformation()
    {
        System.out.println("My name is: "+Name);
        System.out.println("My age is: "+Age);
        System.out.println("My school is: "+School);
    }
    public static void main(String[] args)
    {
        UseOfVariable obj = new UseOfVariable();
        obj.printInformation();
    }
}
