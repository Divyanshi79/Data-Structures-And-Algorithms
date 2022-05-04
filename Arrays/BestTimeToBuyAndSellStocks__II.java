/*** You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.

Find and return the maximum profit you can achieve.

 

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
Total profit is 4 + 3 = 7. */

class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        
        int min = a[0];
        int profit = 0;
        for(int i = 0;i<n-1;i++)
        {
            if(min>=a[i])
                 min = a[i];
            else
            {
                if(a[i+1] < a[i])
                {

                    profit += a[i] - min;
                    min = a[i+1];
                }

            }
                

        }
        if(min<a[n-1])
       profit += a[n-1] - min;
        
        return profit;
            
        
        
    }
}