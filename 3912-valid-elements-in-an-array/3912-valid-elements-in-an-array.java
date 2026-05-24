class Solution {
    public List<Integer> findValidElements(int[] nums) {
        int n = nums.length;
        int right[]= new int[n];
        right[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],nums[i]);
        }
        List<Integer>ans = new ArrayList<>();
        int left = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(i==0|| i==n-1|| nums[i]>right[i+1]|| nums[i]>left){
                ans.add(nums[i]);
            }
            left = Math.max(nums[i],left);
        }
        return ans;
    }
}