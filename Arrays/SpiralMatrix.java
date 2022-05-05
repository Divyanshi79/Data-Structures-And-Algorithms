class Solution {
    public List<Integer> spiralOrder(int[][] a) {
        
        int minR = 0;
        int minC = 0;
        int maxR = a.length-1;
        int maxC = a[0].length-1;
         int total = a.length * a[0].length;

        int c = 0;
        List<Integer> arr = new ArrayList<>();
        while(c<total)
        {

            System.out.println(minR + " " + minC + " " + maxR + " " + maxC);
            for(int i = minR,j=minC;j<=maxC && c<total;j++)
            {
               arr.add(a[i][j]);
                c++;

            }
            
            minR++;
                        

            
             for(int i =minR,j=maxC;i<=maxR && c<total;i++)
           {
                arr.add(a[i][j]);
                c++;

            }
            
            maxC--;
            
             for(int i = maxR,j=maxC;j>=minC && c<total;j--)
            {
                arr.add(a[i][j]);
                
                c++;

            }
             
            maxR--;
            
              for(int i = maxR , j=minC;i>=minR && c<total;i--)
            {
                arr.add(a[i][j]);
                c++;

            }
             
            minC++;
            
            

        }
        return arr;
       
    }
}