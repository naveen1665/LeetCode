class Solution {
    public void backtrack(int start,List<List<Integer>> res,List<Integer> cur,int target,int [] candidates)
    {
        if(target<0)
        {
            return;
        }
        
        if(target==0)
        {
            res.add(new ArrayList<>(cur));
            return;
        }

        for(int i=start;i<candidates.length;i++)
        {
            cur.add(candidates[i]);
            backtrack(i,res,cur,target-candidates[i],candidates);
            cur.remove(cur.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        backtrack(0,res,curr,target,candidates);
        return res;

    }
}
