class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        int nums[]= new int[n];
        for(int i=0;i<digits.length;i++){
               nums[i]=digits[i];
              
        }
        int for9[]=new int[n+1];
        for(int i = n-1;i>=0;i--){
            if(nums[i]<9){
                nums[i] = nums[i]+1;
                 return nums;
            }
            
                nums[i]=0;
            
        }

        for9[0]=1;
        return for9;
    }
}