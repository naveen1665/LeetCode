class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sub=new ArrayList<>();
        sub.add(new ArrayList<>());
        for(int num: nums)
        {
            int size=sub.size();
            for(int i=0;i<size;i++)
            {
                List<Integer> temp=new ArrayList<>(sub.get(i));
                temp.add(num);
                sub.add(temp);

            }

        }
        return sub;
        
    }
}