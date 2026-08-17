class Solution {
    public int[] sortedSquares(int[] nums) {
        int l=0;
        int r = nums.length-1;
        int b[] = new int[nums.length];
      int idx = nums.length-1;
      int ls = 0;
      int rs = 0;
         while(l<=r){
            ls = nums[l]*nums[l];
            rs = nums[r]*nums[r];
            if(ls>rs){
                b[idx--]= ls;
                l++;
            }
            else{
              b[idx--] = rs;
              r--;
            }
         }
         return b;

    }
}