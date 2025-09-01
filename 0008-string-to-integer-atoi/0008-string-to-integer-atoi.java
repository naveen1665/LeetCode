class Solution {
    public int myAtoi(String s) {
        int res=0;
        s=s.trim();
        if (s.length() == 0) return 0;
        boolean isNegative=false;
        if(s.charAt(0)=='-' )
        {
            isNegative=true;
        }
        System.out.print(Integer.MAX_VALUE);
        for(int i=0;i<s.length();i++)
        {
            char temp=s.charAt(i);
            if((temp=='+'||temp=='-') && i==0)
            {
                continue;
            }
            else if(Character.isDigit(temp))
            {
if (res > (Integer.MAX_VALUE - (temp-'0')) / 10) {
    return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
}
                res=(res*10)+(temp-'0');
            }
            else if(!Character.isDigit(temp))
            {
                break;
            }
        }
        if(isNegative)
            return -res;
        return res;


        
    }
}