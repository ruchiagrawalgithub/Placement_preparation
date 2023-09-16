// Check if a,b,c are Pythagorean Triplet. where a,b,c are Numbers 
import java.util.Scanner;

class Pythagoras
{
    public static void main(String arg[])
    {
        System.out.println("please enter a,b,c");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        
        if(a*a + b*b == c*c && b*b+c*c==a*a && c*c+a*a==b*b)
        {
        System.out.println("it is a pythagorus triplet");
        }
        else
        {
        System.out.println("it is not a pythagorus triplet");
        }
    }
}