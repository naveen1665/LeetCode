class Solution {
    public String reverseWords(String s) {
        String [] arr=s.trim().split("\\s+");
        StringBuffer m=new StringBuffer();
        int n=arr.length;
        for(int i=n-1;i>=0;i--)
        {
            if(i==0)
            {
                m.append(arr[i]);
            }
            else
            {
                m.append(arr[i]);
                m.append(" ");   
            }
        }
        return m.toString();
    }
}