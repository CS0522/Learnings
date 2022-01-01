package AbstractClass;
public class Cat extends Animal{
    private String name_temp;
    private int age_temp;
    private String gender_temp;
    Cat(String name, int age, String gender)
    {
        super("0",0,"0");
        this.name_temp=name;
        this.age_temp=age;
        this.gender_temp=gender;
    }
    String cat_getName()
    {
        return this.name_temp;
    }
    int cat_getAge()
    {
        return this.age_temp;
    }
    String cat_getGender()
    {
        return this.gender_temp;
    }
    String _name=name_temp;
    int _age=this.cat_getAge();
    String _gender=this.cat_getGender();
    public void action()
    {
        System.out.println("I'm a cat. I like eating fish.");
    }
    public void getInfo()
    {
        System.out.println("Name: "+_name);
        System.out.println("Age: "+_age);
        System.out.println("Gender: "+_gender);
    }
}
