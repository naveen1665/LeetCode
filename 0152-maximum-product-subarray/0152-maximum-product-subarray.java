class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        if(n==1)
        {
            return nums[0];
        }
        for(int i=0;i<n;i++)
        {
            int temp=1;
            for(int j=i;j<n;j++)
            {
                temp=temp*nums[j];
                max=Math.max(temp,max);
            }
        }
        return max;
        
    }
}