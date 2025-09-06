class Solution {
    public int xorOperation(int n, int start) {
        int res=0;
        while(n!=0)
        {
            res^=start;
            start+=2;
            n--;
        }
        return res;
        
    }
}