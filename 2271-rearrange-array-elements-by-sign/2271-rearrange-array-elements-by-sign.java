class Solution {
    public int[] rearrangeArray(int[] nums) {
        // Queue<Integer> pos=new LinkedList<>();
        // Queue<Integer> neg=new LinkedList<>();
        // for(int num : nums)
        // {
        //     if(num<0)
        //     {
        //         neg.add(num);
        //     }
        //     else
        //     {
        //         pos.add(num);
        //     }
        // }
        // int i=0;
        // while(i<nums.length && !pos.isEmpty() && !neg.isEmpty())
        // {
        //     nums[i++]=pos.remove();
        //     nums[i++]=neg.remove();
        // }
        // return nums;
        int n=nums.length;
        int [] res=new int[n];
        int i=0,j=1;
        for(int k=0;k<n;k++)
        {
            if(nums[k]>0)
            {
                res[i]=nums[k];
                i=i+2;
            }
            else
            {
                res[j]=nums[k];
                j=j+2;
            }
        }
        return res;
    }
}