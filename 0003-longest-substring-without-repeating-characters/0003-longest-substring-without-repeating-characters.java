class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++)
        {
            Set<Character> set=new HashSet<>();
            int count=0;
            for(int j=i;j<n;j++)
            {
                char temp=s.charAt(j);
                if(set.contains(temp))
                {
                    break;
                }
                set.add(temp);
                count++;
            }
            res=Math.max(count,res);
        }
        return res;
        
    }
}