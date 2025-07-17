class Pair {
    int row;
    int col;
    int tm;

    public Pair(int row, int col, int tm) {
        this.row = row;
        this.col = col;
        this.tm = tm;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> qi=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int cnt=0;
        int reff[][]=new int [n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    qi.add(new Pair(i,j,0));
                    reff[i][j]=2;
                }
                else if(grid[i][j]==1)
                    cnt++;
            }
        }
        int tm=0;
        int fcnt=0;
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        while(!qi.isEmpty())
        {
            int row=qi.peek().row;
            int col=qi.peek().col;
            tm=Math.max(tm,qi.peek().tm);
            qi.remove();
            for(int i=0;i<4;i++)
            {
                int nrow=row+drow[i];
                int ncol=col+dcol[i];
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m &&grid[nrow][ncol]==1 && reff[nrow][ncol]==0) 
                {
                    qi.add(new Pair(nrow,ncol,tm+1));
                    reff[nrow][ncol]=2;
                    fcnt++;

                }

            }
        }
        if(cnt!=fcnt)
            return -1;
        return tm;
        
    }
}