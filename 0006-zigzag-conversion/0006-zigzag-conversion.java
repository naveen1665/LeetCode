class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        char [][]arr=new char[numRows][n];
        int row=0,col=0,curr=0;
        while(curr<n)
        {
            while(curr<n &&row<numRows)
            {
                arr[row++][col]=s.charAt(curr++);
            }
            row-=2;
            row=Math.max(0,row);
            while(curr<n && row>0)
            {
                arr[row--][++col]=s.charAt(curr++);
            }
            col++;
        }
        StringBuffer res=new StringBuffer();
        for(int i=0;i<numRows;i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(arr[i][j]!=0)
                {
                    res.append(arr[i][j]);
                }
            }
        }
        
        return res.toString();
    }
}