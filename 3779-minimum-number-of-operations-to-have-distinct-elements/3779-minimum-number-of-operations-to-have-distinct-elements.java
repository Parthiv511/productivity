class Solution {
    public int minOperations(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int start = nums.length;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (set.contains(nums[i])) {
                break;
            }

            set.add(nums[i]);
            start = i;
        }

        return (start + 2) / 3;
    }
}