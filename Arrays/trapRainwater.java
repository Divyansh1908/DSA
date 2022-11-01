public class trapRainwater {
    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void trapped(int arr[])
    {
        int leftMax[] = new int[arr.length];
        int rightMax[] = new int[arr.length];
        int trapWater = 0; //Total Water Trapped

        // Storing Left Max of each element in the leftMax[]
        for(int i = 0; i<arr.length; i++)
        {
            int maxLeftSum = Integer.MIN_VALUE; //For each element we reset the maxLeftSum
            if(i==0) //For the first element we put it same as first element of main array : Otherwise index out of bounds
            {
                leftMax[i] = arr[i];
            }
            else //For all other elements
            {
                for(int j=i-1; j>=0; j--) //Start comparing with one element before that
                {
                    int great =arr[i]; //Initialise great with the number itself : This will help compare as well
                    if(arr[j]>great)
                    {
                        great = arr[j]; //If greater than the orginal number then replace
                    }
                    maxLeftSum = Math.max(great, maxLeftSum); //After traversing the element compare with maxLeftSum
                }
                leftMax[i] = maxLeftSum; //Store the maxLeft of that element in the array.
            }  
        }
        // Storing Right Max of each element in the rightMax[]
        for(int i = 0; i<arr.length; i++)
        {
            int maxRightSum = Integer.MIN_VALUE;
            if(i==arr.length-1)
            {
                rightMax[arr.length-1] = arr[arr.length-1];
            }
            else
            {
                int sum =arr[i];
                for(int j=i+1; j<arr.length; j++)
                {
                    if(arr[j]>arr[i])
                    {
                        sum = arr[j];
                    }
                    maxRightSum = Math.max(sum, maxRightSum);
                }
                rightMax[i] = maxRightSum;
            }  
        }
        printArr(leftMax); //Print left max array
        System.out.println();
        printArr(rightMax);//Print Right max array

        //Finding the trapped water
        for(int i=0; i<arr.length; i++)
        {
            int sum =0;
            int finSum = 0;
            sum = Math.min(leftMax[i],rightMax[i]); //Compare the leftMax and rightMax of the element and minimize it
            finSum = sum - arr[i]; //Substract the hight of the bar from that minimum
            trapWater +=finSum; // Add in trap water
        }
        System.out.println("Trapped Water is :"+trapWater);

    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        int arr2[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int arr3[] = {4,2,0,3,2,5};
        trapped(arr3);
    }
}
