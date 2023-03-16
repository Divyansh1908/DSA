public class quickSorter {
    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[], int start, int end)
    {
        //basecase
        if(start>=end)
        {
            return;
        }
        //kaam
        int pivotIdx = partition(arr, start, end);
        quickSort(arr, start, pivotIdx-1); //sorting the left part
        quickSort(arr, pivotIdx+1, end);//sorting the right part
    }
    public static int partition(int arr[], int start, int end)
    {
        int pivot = arr[end];
        int i = start-1; //to make space for the elements lesser than pivot
        for(int j=start; j<end; j++) // from start index to end index
        {
            if(arr[j]<pivot)
            {
                i++; //At start, increment first to reach the first index in this arr
                //swap with i
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //now moving the pivot to the right spot
        i++; //reaching the place where the new pivot will be located
        int temp = arr[end];
        arr[end] = arr[i];
        arr[i] = temp;
        return i; // index of the pivot

    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
