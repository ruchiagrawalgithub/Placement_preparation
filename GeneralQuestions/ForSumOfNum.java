import java.util.Scanner;
class ForSumOfNum
{
    public static void main(String arg[])
    {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    for(int i=0;i<=n;i++)
    {
        sum = sum + i;
    }
    System.out.println("sum is" + sum );
    }
}