package Grade1Term3Question;
public class Question04 
{
    static String str1="China";
    static String str2="America";
    static String str3="Japan";
    static String str4="Russia";
    static String str5="England";
    static String[] str_array={str1,str2,str3,str4,str5};
    static char[] new_str=new char[str_array.length+1];
    public void sort_func()
    {
        int i,j;
        for (i=0;i<str_array.length-1;i++)
        {
            for (j=0;j<str_array.length-1-i;j++)
            {
                if (str_array[j].length()>str_array[j+1].length())
                {
                    String temp;
                    temp=str_array[j];
                    str_array[j]=str_array[j+1];
                    str_array[j+1]=temp;
                }
            }
        }
    }
    public void print_array(String[] temp_array)
    {
        int i;
        System.out.println("Output the strings by their length: ");
        for (i=0;i<temp_array.length;i++)
        {
            System.out.print(temp_array[i]+" ");
        }
    }
    public void print_array(char[] temp_array)//overloading...
    {
        int i;
        System.out.println();
        System.out.println("Output the strings by their length: ");
        for (i=0;i<temp_array.length;i++)
        {
            System.out.print(temp_array[i]+" ");
        }
    }
    public void new_array()
    {
        char temp_char;
        int i;
        for (i=0;i<str_array.length;i++)
        {
            temp_char=str_array[i].charAt(2);
            new_str[i]=temp_char;
        }
        new_str[i]='\0';
    }
    public static void main(String[] args)
    {
        Question04 obj=new Question04();
        obj.sort_func();
        obj.print_array(str_array);
        obj.new_array();
        obj.print_array(new_str);
    }
}
