class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        temp.add(1);
        res.add(temp);
        for(int i=1;i<numRows;i++)
        {
            res.add(genrow(i));
        }
        return res;

        
    }
    public static List<Integer> genrow(int row)
    {
        int res=1;
        List<Integer> ans=new ArrayList<>();
        ans.add(res);
        for(int i=0;i<row;i++)
        {
            res*=row-i;
            res=res/(i+1);
            ans.add(res);
        }
        return ans;
    }
}