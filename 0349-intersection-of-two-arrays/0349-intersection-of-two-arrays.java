class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int val:nums1)
        {
            set1.add(val);
        }
        for(int val:nums2)
        {
            set2.add(val);
        }
        int c=0;
        for(int val : set1)
        {
            if(set2.contains(val))
            {
                c++;
            }
        }
        int [] arr=new int[c];
        int i=0; 
        for(int val : set1)
        {
            if(set2.contains(val))
            {
                arr[i++]=val;
            }
        }  
        return arr;     
    }
}