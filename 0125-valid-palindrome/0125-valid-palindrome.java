class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        String t="";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            t = ch + t; 
        }
        if(s.equals(t))
            return true;
        return false;


        
    }
}