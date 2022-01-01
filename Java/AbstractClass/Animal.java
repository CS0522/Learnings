package AbstractClass;
public abstract class Animal {
    private String name;
    private int age;
    private String gender;
    Animal(String name, int age, String gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public abstract void action();
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String getGender()
    {
        return gender;
    }
}
