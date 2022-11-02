// TC - O(n)
public class buySellStock {
    public static void stocks(int arr[])
    {
        int buyPrice = Integer.MAX_VALUE; // BuyPrice should be max because we want to set it to be min
        int maxProfit = 0; // MaxProfit initialised with 0, helps in countering the edge case

        for(int i=0; i<arr.length; i++) //Traversing whole array
        {
            int sellPrice = arr[i]; //Initialising selling price with the value of the element
            int profit = 0;
            if(buyPrice<sellPrice) 
            {
                profit = sellPrice-buyPrice;
            }
            else //Set the buyPrice as sellPrice because we want to minimize it.
            {
                buyPrice = sellPrice;
            }
            maxProfit = Math.max(profit, maxProfit); //Maximize the profit
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        stocks(arr);
    }
}
