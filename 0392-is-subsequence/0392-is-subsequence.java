class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0, j=0;
        int m = s.length();
        int n = t.length();
         
          int count=0;
        while(i<m && j<n){
            if(s.charAt(i)==t.charAt(j)){
                count++;
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        if(count==m || s.isEmpty()){
           return true;
        }
        return false;
    }
}