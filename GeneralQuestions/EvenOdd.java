import java.util.Scanner;
class EvenOdd
{
    public static void main(String arg[]) 
    {   
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("PLease enter a no.")
        if(num%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
