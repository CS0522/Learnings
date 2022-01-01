package InterfaceTest;
public class Cat implements AnimalBase, AnimalDerive{//more than one interface.
    public void name()
    {
        System.out.println("My name is Tom.");
    }
    public void age()
    {
        System.out.println("My age is 8.");
    }
    public void gender()
    {
        System.out.println("My gender is male.");
    }
    public void action()
    {
        System.out.println("I like sleeping.");
    }
    public void eat()
    {
        System.out.println("I like eating fish.");
    }
}
