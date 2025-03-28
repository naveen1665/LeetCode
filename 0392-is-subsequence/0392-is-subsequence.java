class Solution {
    public boolean isSubsequence(String s, String t) {
        int low=0;
        if((s.length()>0 && t.length()==0) )
            return false;
        if((s.length()==0 && t.length()==0) || (s.length()==0 && t.length()>0))
            return true;
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)==s.charAt(low) && low<t.length())
            {
                low++;
            }
            if(low>s.length()-1)
                break;
        }
        if(low>=(s.length()))
            return true;
        return false;
        
    }
}