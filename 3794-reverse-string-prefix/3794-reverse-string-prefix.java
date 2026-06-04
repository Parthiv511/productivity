class Solution {
    public String reversePrefix(String s, int k) {

        String rev = "";

        for (int i = k - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }

        return rev + s.substring(k);
    }
}