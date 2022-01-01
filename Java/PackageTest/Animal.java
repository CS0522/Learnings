package PackageTest;
public class Animal 
{
    String AnimalName;
    int AnimalAge;
    public Animal(String TempName, int Age)
    {
        AnimalName=TempName;
        AnimalAge=Age;
    }
    public void getName()
    {
        System.out.println("The name of this animal is: "+AnimalName);
    }
    public void getAge()
    {
        System.out.println("The age of this animal is: "+AnimalAge);
    }
}
