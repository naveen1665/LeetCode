class Solution {
    public static int sumf(int n)
    {
        int sum=0;
            while(n>0)
            {
                int rem=n%10;
                sum=(sum)+rem;
                n=n/10;
            }
        return sum;

    }
    public int countLargestGroup(int n) {
        if(n<10)    return n;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=1;i<=n;i++)
        {
            int sum=sumf(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        int max=0;
        for(int val:map.values())
            max=Math.max(max,val);
        int c=0;
        for(int val:map.values())
        {
            if(val==max)
                c++;
        }
        return c;
        
    }
}