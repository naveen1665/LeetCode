class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> list=new ArrayList<>();
        Map<Long,Integer> map=new HashMap<>();
        Set<String> set=new HashSet<>();
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            map.put((long)nums[i],i);
        }
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n-1;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    long sum=(long)nums[i]+nums[j]+nums[k];
                    long fin=(long)target-sum;
                    if(map.containsKey(fin))
                    {
                        int l=map.get(fin);
                        if(!set.contains(nums[i]+":"+nums[j]+":"+nums[k]+":"+nums[l]) && l>i &&l>j && l>k)
                        {
                            set.add(nums[i]+":"+nums[j]+":"+nums[k]+":"+nums[l]);
                            list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        }
                    }

                }
            }
        }
        return list;
    }
}