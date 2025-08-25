class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n==1)
        {
            return s;
        }
        String res="";
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                String temp=s.substring(i,j+1);
                if(isPalindrome(temp))
                {
                    if(res.length()<temp.length())
                    {
                        res=temp;
                    }
                }
            }
        }
        return res;
        
    }
    public static boolean isPalindrome(String s)
    {
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}