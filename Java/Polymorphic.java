class Shape
{
    void show()
    {
        System.out.println("No shape.");
    }
}
class Circle extends Shape
{
    void show()
    {
        System.out.println("Circle.");
    }
}
class Rectangle extends Shape
{
    void show()
    {
        System.out.println("Rectangle.");
    }
}
class Triangle extends Shape
{
    void show()
    {
        System.out.println("Triangle.");
    }
}
public class Polymorphic {
    public static void main(String[] args)
    {
        Shape a=new Shape();
        Shape b=new Circle();
        Shape c=new Rectangle();
        Shape d=new Triangle();
        Circle e=new Circle();
        a.show();
        b.show();
        c.show();
        d.show();
        e.show();
    }
}
