import java.util.Arrays;
class InsertionSort
{
    public static void insertionSort(int arr[])
    {
        int i,j,temp;
		for(i=1;i<arr.length;i++) // passes
		{
		temp=arr[i];
		for(j=i-1;j>=0 && arr[j]>temp;j--)
		arr[j+1]=arr[j];
		arr[j+1]=temp;
		}
    }
    public static void main(String arg[])
    {
        int arr[] = {90,10,60,45,50,30};
        System.out.println("Array Contents = "+Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Array Contents after sorting = "+Arrays.toString(arr));
    }
}