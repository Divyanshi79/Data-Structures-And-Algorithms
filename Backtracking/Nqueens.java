/**
Input: n = 4
Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
Explanation: There exist two distinct solutions to the 4-queens puzzle as shown above
 */

class Solution {List<List<String>> ans;
    public List<List<String>> solveNQueens(int n) {
     ans = new ArrayList<>();
        // List<String> boar = new ArrayList<>();
        char a[][] = new char[n][n];
        for(int i =0;i<n;i++)
        {
            
            for(int j=0;j<n;j++)
            {
                a[i][j] = '.';
            }

        }
        boolean[] row = new boolean[n];
        boolean[] ndiag = new boolean[2*n-1];
        boolean[] rdiag = new boolean[2*n-1];
        
        List<int[]> queens = new ArrayList<>();
        dfs(a,0,n,row,ndiag,rdiag);
         return ans;
        
    }
    private void dfs(char[][] board, int r , int n, boolean col[],boolean ndiag[] , boolean rdiag[])
    {

        if(r == n)
        {
            List<String> rows = new ArrayList<>();
            for(char[] row : board)
            {

                rows.add(new String(row));
            }
            
            ans.add(rows);

        }
        for(int c=0;c<board.length;c++)
        {
            if(col[c] == false && ndiag[c+r] == false && rdiag[r - c + (n-1)] == false)
            {
                board[r][c] = 'Q';
                col[c] = true;
                ndiag[c+r] = true;
                rdiag[r - c + (n-1)] = true;
                
                
                dfs(board,r+1,n,col,ndiag,rdiag);
                board[r][c] = '.';
                col[c] = false;
                ndiag[c+r] = false;
                rdiag[r - c + (n-1)] = false;
                    

            }

         }

     }
    
