class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int mf = 0;
        int ans = 0;
        int f[] = new int[26];
        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);
              f[ch - 'A']++;
             mf = Math.max(mf, f[ch-'A']);
               int w = r-l+1;
            int ri = w-mf;
            if(ri>k){
                f[s.charAt(l)-'A']--;
                    l++;
            }
            ans  = Math.max(ans,r-l+1);
        }
        return ans;
    }
}