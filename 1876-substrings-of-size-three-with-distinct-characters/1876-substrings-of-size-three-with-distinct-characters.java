class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        int l = 0;
      for(int r = 0; r<s.length();r++){
        if(r-l+1==3){
            char a = s.charAt(l);
            char b = s.charAt(l+1);
            char c = s.charAt(r);

        if(a!=b && b!=c && c!=a)
           count++;

        l++;
        }
      }
      return count;
    }
}