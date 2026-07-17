class Solution {
    public int findNumbers(int[] nums) {
        int ev = 0;
        for(int n : nums){
            int count =0;
           while(n>0){
               count++;
               n=n/10;
           }
           if(count%2==0){
              ev++;
           }
        }
        return ev;
    }
}