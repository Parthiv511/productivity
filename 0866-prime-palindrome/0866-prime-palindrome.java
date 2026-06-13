class Solution {

    public int primePalindrome(int n) {

        if (n>=8 && n <= 11) {
            return 11;
        }

        for (int i = 1; i < 100000; i++) {

            String s = Integer.toString(i);
            StringBuilder sb = new StringBuilder(s);

            sb.deleteCharAt(sb.length() - 1);
            sb.reverse();

            int palindrome = Integer.parseInt(s + sb);

            if (palindrome >= n && isPrime(palindrome)) {
                return palindrome;
            }
        }

        return -1;
    }

    private boolean isPrime(int num) {

        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}