class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int len = Integer.MAX_VALUE;
        int s = 0;
        for(int r = 0; r < nums.length;r++){
            s += nums[r];
            while(s >= target){
                len = Math.min(len, r-l+1);
                s -= nums[l];
                l++;
            }
        }
        if(len==Integer.MAX_VALUE){
            return 0;
        }
       return len;
    }
}