class Solution {
    public int findLHS(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int x: nums){
            mp.put(x, mp.getOrDefault(x,0)+1);
            
        }

        for(int x: mp.keySet()){
            if(mp.containsKey(x+1)){
                ans = Math.max(ans,mp.get(x)+mp.get(x+1));
            }
        }
        return ans;
    }
}