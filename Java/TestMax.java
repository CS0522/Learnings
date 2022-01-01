public class TestMax 
{
    public static void main(String[] args)
    {
        int i=5;
        int j=2;
        int Max=max(i,j);
        System.out.println("Max is: "+Max);
    }    
    public static int max(int num1, int num2)
    {
        int result;
        result=num1>num2?num1:num2;
        return result;
    }
}
