class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i=0;
        int n = nums.length;
        List<String> ans = new ArrayList<>();
        while(i<n){
            int st = nums[i];
            while(i+1<n && nums[i+1]==nums[i]+1){
                i++;
            }
            int end = nums[i];
            if(st==end){
              ans.add(Integer.toString(st));
            }
            else{
                ans.add(Integer.toString(st)+"->"+Integer.toString(end));
            }
            i++;
        }
        return ans;
    }
}