import java.util.Scanner;
class ForFactorial
{
public static void main(String arg[])
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int fac=1;
for(int i=1;i<=n;i++)
{
    fac = fac*i;
    System.out.println(fac);
}
}
}