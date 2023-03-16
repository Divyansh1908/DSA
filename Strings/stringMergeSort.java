public class stringMergeSort {
    public static void printArr(String arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static boolean isSmall(String s1, String s2)
    {
        if(s1.compareTo(s2)<0)
            return true;

        return false;
    }
    public static void mergersort(String[] arr, int start, int end)
    {
        if(start>=end)
        {
            return;
        }
        //kaam
        int mid = start+(end-start)/2;
        mergersort(arr, start, mid);//make left part
        mergersort(arr, mid+1, end);

        merge(arr, start, mid, end);
    }
    public static void merge(String[] arr, int start, int mid, int end)
    {
        String[] temp = new String[end-start+1];
        int leftidx =start;
        int rightidx = mid+1;
        int k = 0;
        
        while(leftidx<mid && rightidx<end)
        {
            // System.out.println(arr[leftidx]);
            // System.out.println("XXXX");
            // System.out.println(arr[rightidx]);
            // System.out.println("       ");
        System.out.println(arr[leftidx].compareTo(arr[rightidx])<0);
            if(isSmall(arr[leftidx], arr[rightidx]))
            {
                temp[k] = arr[leftidx];
                leftidx++;
            }
            else
            {
                temp[k] = arr[rightidx];
                rightidx++;
            }
            k++;
        }

        //remaining left part
        while(leftidx<mid)
        {
            temp[k++] = arr[leftidx++];
        }
        while(rightidx<mid)
        {
            temp[k++] = arr[rightidx++];
        }
        for(k=0, leftidx=start; k<temp.length; k++, leftidx++) //resuing variable names
        {
            System.out.println(temp[k]);
            arr[leftidx] = temp[k];
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] arr =  { "sun", "earth", "mars", "mercury"};
        mergersort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

