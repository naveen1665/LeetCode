class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            Map<Character,Integer> map=new HashMap<>();
            int start=i;
            while(start<s.length())
            {
                if(!map.containsKey(s.charAt(start)))
                {
                    map.put(s.charAt(start),1);
                    start++;
                }
                else
                    break;
                
                
            }
            max=Math.max(map.size(),max);
        }
        return max;

        
    }
}