class Solution {
    public String longestPalindrome(String s) {
        String res="";
        if(s.length()==1)
            return s;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String sub=s.substring(i,j+1);
                if(check(sub))
                {
                    if(sub.length()>res.length())
                    {
                        res=sub;
                    }
                }
            }
        }
        return res;
        
    }
    public static boolean check(String str)
    {
        int low=0;
        int high=str.length()-1;
        while(low<high)
        {
            if(str.charAt(low)!=str.charAt(high))
                return false;
            low++;
            high--;

        }
        return true;
    }
}