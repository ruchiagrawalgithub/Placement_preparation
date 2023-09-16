import java.util.Scanner;
class Pythagorean
{
    public static void main(String arg[])
    {
        System.out.println("enter a,b,c");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a*a+b*b==c*c || b*b + c*c ==a*a || a*a + c*c ==b*b)
        {
           System.out.println("its a Pythagorean triplet"); 
        }
        else
        {
           System.out.println("its not a Pythagorean triplet"); 
        }
    }
}