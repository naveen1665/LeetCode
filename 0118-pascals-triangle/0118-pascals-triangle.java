class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        if(numRows>=1)
        {
            List<Integer> fr=new ArrayList<>();
            fr.add(1);
            res.add(fr);
        }
        for(int i=0;i<numRows-1;i++)
        {
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=0;j<=i;j++)
            {
                temp.add(ncr(i+1,j+1));
            }
            res.add(temp);
        }
        return res;
        
    }
    public static int ncr(int n,int r)
    {
        int res=1;
        for(int i=0;i<r;i++)
        {
            res*=(n-i);
            res/=i+1;
        }
        return res;
    }
}