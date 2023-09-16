import java.util.Arrays;
class BubbleSort
{
    public static void bubble(int arr[])
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
     int arr[] = {10,33,12,56,38,76,1,87,77} ;
     System.out.println("Unsorted array is:- " + Arrays.toString(arr));
     bubble(arr);
     System.out.println("Sorted array is:- " + Arrays.toString(arr));
    }
}