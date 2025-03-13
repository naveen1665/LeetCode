class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;  // Check if the number is negative
        long reversed = 0;
        
        while (x != 0) {
            int lastDigit = x % 10;
            x /= 10;
            
            if (Math.abs(reversed) > (Integer.MAX_VALUE / 10)) {
                return 0; 
            }
            
            reversed = reversed * 10 + lastDigit;
        }
        
        return (int) reversed;
    }
}
