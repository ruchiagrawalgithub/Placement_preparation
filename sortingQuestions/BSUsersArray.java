import java.util.Scanner;
import java.util.Arrays;
class BSUsersArray
{
    public static void bubblesort(int[] arr)
    {
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=1;j<=arr.length-1;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(String arg[])
    {
        System.out.println("enter no of elements");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<=n-1;i++)
        {
            System.out.println("enter Elements");
            arr[i]=sc.nextInt();
        }
            System.out.println("Initial Array :- " +Arrays.toString(arr));
            bubblesort(arr);
            System.out.println("sorted Array :- " +Arrays.toString(arr));
    }
}
