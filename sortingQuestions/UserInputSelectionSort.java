import java.util.Arrays;
import java.util.Scanner;
// time Complexity of selection Sort is O(n^2)
// no of time swap done is n
class UserInputSelectionSort
{
     public static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    //swap arr[j] to arr[i]
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
          {
            System.out.println("enter Elements");
            arr[i]=sc.nextInt();
          }
            System.out.println("Array Contents = "+Arrays.toString(arr));
		    selectionSort(arr);
		    System.out.println("Array Contents after sorting = "+Arrays.toString(arr));
           
    }
}