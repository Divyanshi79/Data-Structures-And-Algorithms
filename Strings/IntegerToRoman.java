class Solution {
    final static int[] val = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    final static String[] rom = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

     public String intToRoman(int n) {
         
         String s= "";
         for(int i=0; n>0;i++)
         {
             while(n>=val[i])
             {

                 s=s+rom[i];
                 n=n-val[i];
             }

         }
         return s;
     }
    
}