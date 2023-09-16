// swap occurs n+1 times
// time complexity is O(n2)


/* Analyze the time complexity of Bubble Sort. 
Calculate the number of comparisons and swaps for 
different-sized arrays and observe the trend*/

import java.util.Scanner;
import java.util.Arrays;

class BSUsersArrayCount
{
    public static int bubblesort(int[] arr)
    {   
        int count = 0;
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
            count++;
        }
        return count;
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
            System.out.println("count is:- " + bubblesort(arr));
    }
}
