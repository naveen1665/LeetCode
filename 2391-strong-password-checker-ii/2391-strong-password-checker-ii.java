class Solution {
    public boolean strongPasswordCheckerII(String p) {
        int lc=0;
        int uc=0;
        int num=0;
        int sc=0;
        for(int i=0;i<p.length()-1;i++)
        {
            if(p.charAt(i)==p.charAt(i+1))
                return false;
        }
        for(int i=0;i<p.length();i++)
        {
            char t=p.charAt(i);
            if(Character.isDigit(t))
                num=1;
            else if(Character.isLowerCase(t) )
                lc=1;
            else if(Character.isUpperCase(t))
                uc=1;
            else 
                sc=1;
        }
        if(sc==1 && uc==1 && lc==1 && num==1 && p.length() >=8)
            return true;
        else
            return false;
        
    }
}