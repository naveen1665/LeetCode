class Find{
    int i;
    int j;
    public Find(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<Find> q=new LinkedList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j]==0)
                {
                    q.add(new Find(i,j));
                }
            }
        }
        while(!q.isEmpty())
        {
            int i=q.peek().i;
            int j=q.peek().j;
            q.remove();

            for(int row=0;row<n;row++)
            {
                matrix[row][j]=0;
            }
            for(int col=0;col<m;col++)
            {
                matrix[i][col]=0;
            }

        }
    }
}