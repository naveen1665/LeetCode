class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list=new ArrayList<>();
        List<Integer> linkedlist=new LinkedList<>();
        for(int i=nums.length-1;i>=0;i--)
        {
            int index=getIndex(list,nums[i]);
            linkedlist.add(0,index);
        }
        return linkedlist;
    }
    static int getIndex(List<Integer> list,int element)
    {
        int low=0;
        int high=list.size()-1;
        if(list.isEmpty() || list.get(0)>element)
        {
            list.add(0,element);
            return 0;
        }

        else if(list.get(high)<element)
        {
            list.add(element);
            return high+1;
        }
        while(high-low>1)
        {
            int mid=(high+low)/2;
            if(element<=list.get(mid))
            {
                high=mid;
            }
            else
            {
                low=mid;
            }
        }
        if(element<=list.get(low))
        {
            list.add(low,element);
            return low;
        }
        else if(element>list.get(high))
        {
            list.add(high+1,element);
            return high+1;
        }
        else
        {
            list.add(high,element);
            return high;
        }
    }
}