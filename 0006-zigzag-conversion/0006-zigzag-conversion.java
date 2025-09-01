class Solution {
    public String convert(String s, int numRows) {
        char [][]arr=new char[numRows][s.length()];
        int n=s.length();
        int row=0,col=0,curr=0;
        while(curr<n)
        {
            while(curr<n &&row<numRows)
            {
                arr[row++][col]=s.charAt(curr++);
            }
            row-=2;
            row=Math.max(0,row);
            col++;
            while(curr<n && row>=1)
            {
                arr[row--][col++]=s.charAt(curr++);
            }
            row=0;
            col++;
        }
        StringBuffer res=new StringBuffer();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]!=0)
                {
                    System.out.print(" ");
                    res.append(arr[i][j]);
                    continue;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        return res.toString();
    }
}