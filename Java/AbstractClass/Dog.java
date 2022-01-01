package AbstractClass;
public class Dog extends Animal{
    Dog(String name, int age, String gender)
    {
        super("0",0,"0");
    }
    String _name=this.getName();
    int _age=this.getAge();
    String _gender=this.getGender();
    public void action()
    {
        System.out.println("I'm a dog. I like eating bones. ");
    }
    public void getInfo()
    {
        System.out.println("Name: "+_name);
        System.out.println("Age: "+_age);
        System.out.println("Gender: "+_gender);
    }
}
