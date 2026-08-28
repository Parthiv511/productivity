class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0;
        int sum = 0;
        double ans = Double.NEGATIVE_INFINITY;
        for(int r=0;r<nums.length;r++){
            sum += nums[r];
            if(r-l+1==k){
                ans = Math.max(ans,(double)sum/k);
                sum -= nums[l];
                l++;
            }

        }
        return ans;
    }
}