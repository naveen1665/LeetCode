class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int F0 = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
            F0 += i * nums[i];
        }

        int max = F0;
        int Fk = F0;

        for (int k = 1; k < n; k++) {
            Fk = Fk + sum - n * nums[n - k]; 
            max = Math.max(max, Fk);        
        }

        return max;
    }
}
