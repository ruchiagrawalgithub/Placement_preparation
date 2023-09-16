/* Implement a function that 
finds the largest element in an array using Bubble Sort without fully sorting the array.*/
import java.util.Arrays;
class LargestElement
{
    public static void bubblesort(int arr[])
    {
        for(int i=0;i<1;i++)
        {
            for(int j=1;j<arr.length;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String arg[])
    {
        int arr[]={10,90,60,40,50};
        System.out.println(Arrays.toString(arr));
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);
    }
}