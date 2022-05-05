pclass Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        if( n==0)
            return;
        if(m==0)
        {
            int j =0;
            for(int i=0;i<n;i++)
            {
                a[i] = b[i];

            }



        }
        
        int i = m;
        int j =0;
        while(j<n)
        {
            a[i++] = b[j++];

        }
        
        Arrays.sort(a);
    }
}
