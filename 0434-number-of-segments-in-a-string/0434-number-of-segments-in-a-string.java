class Solution {
    public int countSegments(String s) {
        int count = 0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!=32 && (i==0 || s.charAt(i-1)==32))
               count++;

        }
        if(s.length()==0)
        return 0;

        return count;
    }
}