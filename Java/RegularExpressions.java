import java.util.regex.*;
public class RegularExpressions 
{
    public static void main(String[] args)
    {
        String content="I am noob"+"www.noob.com";
        String pattern=".*noob.*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("字符串中是否包含了 'runoob' 子字符串?\n " + isMatch);
    }    
}