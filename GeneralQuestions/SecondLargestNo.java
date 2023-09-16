// class SecondLargestNo
// {
//     public static void main(String arg[])
//     {
//     int num1=10;
//     int num2=20;
//     int num3=30;

//     if(num1>num2)
//     {
//         if(num1>num3)
//         {
//             if(num2>num3)
//             {
//                 System.out.println("num2 is second greatest");
//             }
//             else 
//             {
//                 System.out.println("num3 is second greatest");
//             }
//         }
//     else
//     {
//         if(num2>num1)
//         {
//             if(num2>num3)
//             {
//                 if(num1>num3)
//                 {
//                     System.out.println("num1 is second largest");
//                 }
//                 else
//                 {
//                     System.out.println("num3 is second largest");
//                 }

//             }
//         }
//     }

//     }
//     {

//     }
//     }
// }
import java.util.Scanner;
class SecondLargestNo{
    public static void main(String arg[]){
        System.out.println("Please enter num1 , num2, num3");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if (num1>num2 && num1<num3 || num1>num3 && num1<num2)
        {
            System.out.println("Num1 is second Largest");
        }
        else if (num2>num1 && num2<num3 || num3>num2 && num1>num2 )
        {
            System.out.println("Num2 is second Largest");
        }
        else
        {
            System.out.println("Num3 is second Largest");
        }
    }
}