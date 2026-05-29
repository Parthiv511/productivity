class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;

       

      
        int[] suffix = new int[n];
        suffix[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = nums[i] + suffix[i + 1];
        }

        int count = 0;

      
        for (int i = 0; i < n - 1; i++) {
            int rightSum = suffix[i + 1];
            int rightCount = n - i - 1;

            double average = (double) rightSum / rightCount;

            if (nums[i] > average) {
                count++;
            }
        }

        return count;
    }
    }