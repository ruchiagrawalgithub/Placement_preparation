import java.util.Arrays;
class CountSwapBubbleSort
{
    public static int bubblesort(int arr[])
    {
        int count=0;
        for(int i=0;i<=arr.length;i++)
        {
            for(int j=1;j<=arr.length-1;j++)
            {
                if(arr[j]>arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1] =arr[j];
                    arr[j] = temp;
                }
            }
            count++;
        }
        return count;        
    }
    public static void main(String arg[])
    {
        int arr[] = {10, 33, 12, 56, 38, 76, 1, 87, 77};
        System.out.println("Unsorted list:- "+Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("Sorted list:- "+Arrays.toString(arr));
        System.out.println(bubblesort(arr));
    }
}