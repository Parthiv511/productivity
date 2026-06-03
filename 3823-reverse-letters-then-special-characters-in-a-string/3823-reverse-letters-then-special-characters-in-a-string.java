class Solution {
    public String reverseByType(String s) {

        String letters = "";
        String specials = "";

        for (char ch : s.toCharArray()) {

            if (Character.isLowerCase(ch)) {
                letters += ch;
            } else {
                specials += ch;
            }
        }

        String revLetters = "";
        String revSpecials = "";

        for (int i = letters.length() - 1; i >= 0; i--) {
            revLetters += letters.charAt(i);
        }

        for (int i = specials.length() - 1; i >= 0; i--) {
            revSpecials += specials.charAt(i);
        }

        String ans = "";

        int l = 0;
        int sp = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isLowerCase(ch)) {
                ans += revLetters.charAt(l++);
            } else {
                ans += revSpecials.charAt(sp++);
            }
        }

        return ans;
    }
}