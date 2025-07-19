class Solution {
    public void moveZeroes(int[] nums) {
        Queue<Integer> queue=new LinkedList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                queue.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(!queue.isEmpty())
            {
                nums[i]=queue.remove();
            }
            else
                nums[i]=0;
        }
        
    }
}