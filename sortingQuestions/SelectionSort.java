import java.util.Arrays;
class SelectionSort
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
        int arr[] = {90,10,60,45,50,30};
        System.out.println("Array Contents = "+Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("Array Contents after sorting = "+Arrays.toString(arr));
    }
}