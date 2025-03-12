class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] arr=new int[nums1.length + nums2.length];
        int top=0;
        for(int i: nums1)
            arr[top++]=i;
        for(int i: nums2)
            arr[top++]=i;
        Arrays.sort(arr);
        if(arr.length %2==0)
        {
            return (double)(arr[arr.length/2]+arr[(arr.length/2)-1])/2;
        }
        else
            return arr[(int)arr.length/2];
        
        
    }
}