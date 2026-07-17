class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
       Arrays.sort(nums);
 int i= nums.length-1;
 int j = nums.length-2;
  max = (nums[i]-1)*(nums[j]-1);
  return max;
    }
}