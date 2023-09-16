import java.util.Scanner;
class PrimeNumber
{
    public static void main(String arg[])
    {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        for(int i=2;i<num;i++)
      	{
          if(num%i == 0)
          {
            isPrime = false;
            break;
          }
    	}
				if(isPrime == true)
        {
          System.out.println("is a prime number");
        }
        else
        {
          System.out.println("is not a prime number");
        }
    }
}