 //an n-digit number is an Armstrong number if the sum of its digits, each raised to the nth power, equals the number itself. 
import java.util.Scanner;
class ArmStrongNo
{
    public static boolean armstrong(int num)
    {
        int temp,count=0,sum=0,rem=0,power=1;
        temp=num;
        while(temp>0)
        {
            temp = temp/10;
            count++;
        System.out.println("Count is"+count);
        }
            temp=num;
            while(temp>0)
            {
                rem = temp%10;
                //System.out.println("rem is"+rem);

               sum +=  (Math.pow(rem, count));
            //    for(int i=1;i<=count;i++)
            //     {
            //         System.out.println("rem is"+rem);

            //         power *=rem;
            //         // temp=temp/10;
            //         System.out.println("power is"+power);
            //         //sum +=power;
            //     }
            //     sum +=power;

                temp=temp/10;
            }
            System.out.println("Sum is"+sum);
            if(sum == num)
            return true;
            else return false;
    }
    public static void main( String arg[])
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("armstrong number is: " + armstrong(num));
    }
}
