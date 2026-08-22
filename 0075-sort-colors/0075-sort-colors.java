class Solution {
    public void sortColors(int[] nums) {
       int l = 0;
       int r = nums.length-1;
       int mid=0;
       while(mid<=r){
        if(nums[mid]==2){
            int temp = nums[r];
            nums[r] = nums[mid];
            nums[mid] = temp;
            r--;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            int temp = nums[mid];
           nums[mid] = nums[l];
           nums[l] = temp;
           l++;
           mid++;
        }
       }
    }
}