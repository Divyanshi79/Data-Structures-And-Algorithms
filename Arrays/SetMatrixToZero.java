class Solution {
    public void setZeroes(int[][] a) {
        int r = a.length;
        int c = a[0].length;
            
            int row[] = new int[r];
        int column[] = new int[c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(a[i][j] == 0)
                {
                    row[i] = 1;
                    column[j] = 1;
               
                }
            }

        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(row[i] == 1 || column[j] == 1)
                {
                    a[i][j] =0;

                }
                    

            }

        }
        
    }
}