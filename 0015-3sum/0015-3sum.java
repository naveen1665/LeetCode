class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> list=new ArrayList<>();
        // Set<List<Integer>> set=new HashSet<>();
        // int n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         for(int k=j+1;k<n;k++)
        //         {
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
        //                 temp.sort(null);
        //                 set.add(temp);
        //             }
        //         }
        //     }
        // }
        // for(List<Integer> l1 :set)
        // {
        //     list.add(l1);
        // }
        // return list;


        List<List<Integer>> list=new ArrayList<>();
        Set<List<Integer>> Mset=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            Set<Integer> set=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                
                int req=-(nums[i]+nums[j]);
                if(set.contains(req))
                {
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],req);
                    temp.sort(null);
                    Mset.add(temp);
                }
                set.add(nums[j]);
            }
        }
        for(List<Integer> l1 : Mset)
        {
            list.add(l1);
        }
        return list;
        
    }
}