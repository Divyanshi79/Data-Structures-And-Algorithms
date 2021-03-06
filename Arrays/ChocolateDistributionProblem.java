/*****

Given an array A[ ] of positive integers of size N, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are M students, the task is to distribute chocolate packets among M students such that :
1. Each student gets exactly one packet.
2. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum.

Input:
N = 8, M = 5
A = {3, 4, 1, 9, 56, 7, 9, 12}
Output: 6
Explanation: The minimum difference between 
maximum chocolates and minimum chocolates 
is 9 - 3 = 6 by choosing following M packets :
{3, 4, 9, 7, 9}.



 ********/


 class Solution
{
    public long findMinDiff (ArrayList<Long> arr, long n, long m)
    {
        // your code here
        long a[] = new long[(int)n];
        
        for(long i=0L;i<n;i++)
        {
            a[(int)i] = arr.get((int)i) ;
            // System.out.println(a[(int)i]);
        }
        Arrays.sort(a);
        long diff = Long.MAX_VALUE;
        for(int i =0;i+m-1<n;i++)
        {
           if(diff > a[(int)(i+m-1)] - a[(int)i])
           {
                // System.out.println(a[(int)i]);
               diff = a[(int)(i+m-1)] - a[(int)i];
           }
        }
        
        // long t = n;
        return diff;
    }
}