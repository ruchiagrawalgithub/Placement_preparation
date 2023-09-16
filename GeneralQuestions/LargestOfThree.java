import java.util.Scanner;
class LargestOfThree
{
    public static int largest(int num1,int num2,int num3)
    {   
        int num=0;
        if(num1>num2 && num1>num3 )
        {
            num= num1;
        }
        else if(num2>num3 && num2>num2 )
        {
             num= num2;
        }
        else
        {
            num= num3;
        }
        return num;
    }
    public static void main(String arg[])
    {
        System.out.println("enter 3 number");
        Scanner sc = new Scanner(System.in);
            int num1= sc.nextInt();
            int num2= sc.nextInt();
            int num3= sc.nextInt();
        int num=largest(num1,num2,num3);
        System.out.println("Largest number is "+ num);
    }
}
// import java.util.Scanner;

// class LargestOfThree {
//     public static int largest(int num1, int num2, int num3) {
//         int result;
//         if (num1 > num2 && num1 > num3) {
//             result = num1;
//         } else if (num2 > num1 && num2 > num3) {
//             result = num2;
//         } else {
//             result = num3;
//         }
//         return result;
//     }

//     public static void main(String arg[]) {
//         System.out.println("Enter 3 numbers");
//         Scanner sc = new Scanner(System.in);
//         int num1 = sc.nextInt();
//         int num2 = sc.nextInt();
//         int num3 = sc.nextInt();
        
//         int result = largest(num1, num2, num3); // Store the result in a variable
//         System.out.println("The largest number is: " + result); // Print the result
//     }
// }
