class Solution {
    public int thirdMax(int[] nums) {
            Set<Integer> set=new HashSet<>();
            for(int val : nums)
            {
                set.add(val);
            }
            int[] arr=new int[set.size()];
            int i=0;
            for(int val:set)
            {
                arr[i++]=val;
            }
            Arrays.sort(arr);
            if(arr.length<3)
                return arr[set.size()-1];
            return arr[set.size()-3];

        
    }
}