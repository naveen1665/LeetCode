class Solution {
    public List<List<String>> groupAnagrams(String[] word) {
        Map<String,List<String>> map=new HashMap();
        for(String s : word)
        {
            char [] arr=s.toCharArray();
            Arrays.sort(arr);
            String temp=new String(arr);
            if(!map.containsKey(temp))
            {
                map.put(temp,new ArrayList<>());
            }
            map.get(temp).add(s);
        }
        return new ArrayList<>(map.values());
        
    }
}