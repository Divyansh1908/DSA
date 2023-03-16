public class mergeSort {
    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSor(int arr[], int start, int end)
    {
        // basecase
        if(start>=end)
        {
            return;
        }
        int mid = start+(end-start)/2;
        //kaam
        mergeSor(arr, start, mid); //divide for the left part
        mergeSor(arr, mid+1, end); //divide for the right part

        merge(arr, start, mid, end);//actual sorting now
    }
    public static void merge(int arr[], int start, int mid, int end) {
        //if arr1 = (0, 3) = 4; arr2 = (4,6) = 3 THEREFORE the size of the temp array should be 7 so that it can fit both which is end -start+1 = 6-0+1 = 7
        int[] temp = new int[end-start+1];
        int i = start; //counter init for the left part
        int j = mid+1; //counter init for right part
        int k = 0;//counter for the temp arr


        //code for merging 2 sorted arrays
        // incrementing the counter/pointer for the smallest element amongst the two and putting the element in temp arr
        while(i<=mid && j<=end) //till the end of each part
        {
            if(arr[i]<arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else
            {
                temp[k] = arr[j];
                j++;
            }
            k++; // k increment at all times as we are putting some or the other value to it
        }

        //leftover elements if any in left part
        while(i<=mid)
        {
            temp[k++] = arr[i++];
        }
        //leftover elements if any in right part
        while(j<=end)
        {
            temp[k++] = arr[j++];
        }
        //copying temp in orginal array as it is automatically updated, otherwise we would have the pain to return after each iteration
        for(k=0, i=start; k<temp.length; k++, i++)
        {
            arr[i] = temp[k];
        }


    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2};
        mergeSor(arr, 0, arr.length-1);
        printArr(arr);
    }
}
