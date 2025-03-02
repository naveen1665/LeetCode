class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int [] arr=new int[2];
        for(int num:nums)
            map.put(num,map.getOrDefault(num,0)+1);
        int i=0;
        for(int num:nums)
        {
            if(map.get(num)==1)
                arr[i++]=num;
                
        }
        return arr;
        
    }
}