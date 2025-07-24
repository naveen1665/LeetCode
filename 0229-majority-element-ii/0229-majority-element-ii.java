class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        Set<Integer> set=map.keySet();
        List<Integer> list=new ArrayList<>();
        for(int key : set)
        {
            int temp=map.get(key);
            if(temp>(nums.length/3))
            {
                list.add(key);
            }
        }
        return list;
    }
}