package PackageTest;
public class AnimalTest
{
    public static void main(String[] args)
    {
        Animal Cat = new Animal("Cat",10);
        Animal Dog = new Animal("Dog",15);
        Cat.getName();
        Cat.getAge();
        Dog.getName();
        Dog.getAge();
    }
}