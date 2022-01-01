package AbstractClass;

public class AbstractDemo {
    public static void main(String[] args)
    {
        Cat objCat=new Cat("Tom",15,"Male");
        Dog objDog=new Dog("John",20,"Male");
        objCat.action();
        objCat.getInfo();
        objDog.action();
        objDog.getInfo();
    }
}
