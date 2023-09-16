import java.util.Scanner;
class Factors
{
    public static int factors(int num)
    {
        int factor =1;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                factor = i;
                System.out.println(i);
            }
        }
        return factor;
    }
    public static void main(String arg[])
    {   
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factors(num);
    }
}