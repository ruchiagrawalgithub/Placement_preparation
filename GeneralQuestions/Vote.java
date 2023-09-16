import java.util.Scanner;

//import java.util.*;

class Vote
{
    public static void main(String arg[])
    {
        System.out.println("please enter age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        //int age = 20;
        if(age>=18)
        {
            System.out.println("can Vote");
        }
        else
        {
            System.out.println("can not Vote");
        }

    }
}
