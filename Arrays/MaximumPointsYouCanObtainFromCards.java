/**
There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

Your score is the sum of the points of the cards you have taken.

Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

 Example 1:
Input: cardPoints = [1,2,3,4,5,6,1], k = 3
Output: 12
Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.
 */

 class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sumA= 0;

        
        for(int i =0;i<k;i++)
        {
          sumA = sumA + cardPoints[i];
        }
       int n  = cardPoints.length;
         
        int sum  = 0;
        int i = k-1;
        int sumAd = 0;
        int p = n-1;
        int B = 0;
        int sumFinal = sumA;
        while(k!=0)
        {
          sumAd =sumAd + cardPoints[i] ;
            int diffD = sumA - sumAd;
             B = B + cardPoints[p];
                sum = diffD + B;
            if(sum > sumFinal)
                {
                sumFinal = sum;
                    }
                p--;
                k--;
             i--;
            }
        return sumFinal;
    }
}