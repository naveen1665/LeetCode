class Solution {
    public int findMin(int[] nums) {
        boolean flag=false;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]>nums[i])
            {
                flag=true;
                return nums[i];
            }
        }
        // if(!flag)
            return nums[0];
        // return 
        
    }
}