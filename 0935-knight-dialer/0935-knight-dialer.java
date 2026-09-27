class Solution {
    public int knightDialer(int n) {
        int MOD = 1_000_000_007;

        long[] dp = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int[][] moves = {
            {4, 6},
            {6, 8},
            {7, 9},
            {4, 8},
            {0, 3, 9},
            {},
            {0, 1, 7},
            {2, 6},
            {1, 3},
            {2, 4}
        };

        for (int len = 2; len <= n; len++) {
            long[] next = new long[10];

            for (int digit = 0; digit < 10; digit++) {
                for (int prev : moves[digit]) {
                    next[digit] = (next[digit] + dp[prev]) % MOD;
                }
            }

            dp = next;
        }

        long answer = 0;

        for (long count : dp) {
            answer = (answer + count) % MOD;
        }

        return (int) answer;
    }
}