class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int [] arr= new int[n];
        int left=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<pivot)
            {
                arr[left++]=nums[i];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(pivot==nums[i])
                arr[left++]=pivot;
        }
        for(int i=0;i<n;i++)
        {
            if(nums[i]>pivot)
                arr[left++]=nums[i];
        }
        return arr;
    }
}