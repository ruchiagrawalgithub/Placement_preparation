class A
{
    public void show()
    {
        System.out.println("in show A");
    }
}
class B extends A
{
     public void show()
    {
        System.out.println("in show B");
    }

}
public class Demo
{

public static void main(String agr[])
{
    A obj = new A();
    obj.show();

    // obj = new B();
    // obj.show();
}
}