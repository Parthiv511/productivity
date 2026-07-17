class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int li=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
                li = i;
            }
        }
        boolean f = true;
        for(int i=0;i<nums.length;i++){
            if(i==li){
                continue;
            }
            if(nums[li] < 2*nums[i]){
                f = false;
                break;

            }
        }
        if(f){
            return li;
        }
        else{
            return -1;
        }

    }
}