class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> pos=new LinkedList<>();
        Queue<Integer> neg=new LinkedList<>();
        for(int num : nums)
        {
            if(num<0)
            {
                neg.add(num);
            }
            else
            {
                pos.add(num);
            }
        }
        int i=0;
        while(i<nums.length && !pos.isEmpty() && !neg.isEmpty())
        {
            nums[i++]=pos.remove();
            nums[i++]=neg.remove();
        }
        return nums;
        
    }
}