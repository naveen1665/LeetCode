class Pair{
    int row;
    int col;
    int time;
    public Pair(int row,int col,int time)
    {
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> queue=new LinkedList<>();
        // int reff[][]=new int [n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    queue.add(new Pair(i,j,0));
                    // reff[i][j]=2;
                }
            }
        }

        int time=0;
        int[] drow={-1,0,1,0};
        int[] dcol={0,1,0,-1};
        while(!queue.isEmpty())
        {
            int nrow=queue.peek().row;
            int ncol=queue.peek().col;
            time=Math.max(time,queue.peek().time);
            queue.remove();
            for(int i=0;i<4;i++)
            {
                int row=nrow+drow[i];
                int col=ncol+dcol[i];
                if(row>=0 && row<n && col>=0 && col<m && grid[row][col]==1)
                {
                    queue.add(new Pair(row,col,time+1));
                    grid[row][col]=2;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1)
                    return -1;
            }
        }
        return time;
        
        
    }
}