class Solution {
    public int singleNumber(int[] nums) {
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++)
        // {
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(int num :nums)
        // {
        //     if(map.get(num)==1)
        //         return num;
        // }
        // return -1;

        int xor=0;

        for(int i=0;i<nums.length;i++)
        {
            xor=xor^nums[i];
        }
        return xor;
        
    }
}