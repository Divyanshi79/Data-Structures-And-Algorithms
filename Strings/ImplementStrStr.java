/**
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

 

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2 */

class Solution {
    public int strStr(String haystack, String needle) {

        if(haystack.length() < needle.length())
            return -1;
        String[] myArray = haystack.split(needle);
        
        if(myArray.length>1)
        {
           
            return myArray[0].length();

        }
        else
        {
            int n = needle.length();
            String t = haystack.substring(0,needle.length());
            if(t.equals(needle))
                return 0;
            String s=haystack.substring(haystack.length() - n,haystack.length());
            
           
            if(s.equals(needle))
                return haystack.length() - n;
            

        }
        return -1;
        
        
        
    }
}