class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int prev=0,curr=0,ans=0;
        for(int i:nums)
        {
            if(i==1)
            {
                curr++;
            }
            else
            {
                ans=Math.max(ans,prev+curr);
                prev=curr;
                curr=0;
            }
        }
        ans = Math.max(ans,prev+curr);
        if(ans==n)
            return ans-1;
        return ans;
        
    }
}