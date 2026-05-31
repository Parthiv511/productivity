import java.util.*;

class Solution {
    public int mirrorFrequency(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        Set<Character> visited = new HashSet<>();
        int ans = 0;

        for (char ch : freq.keySet()) {
            if (visited.contains(ch)) continue;

            char mirror;

            if (Character.isLetter(ch)) {
                mirror = (char) ('z' - (ch - 'a'));
            } else {
                mirror = (char) ('9' - (ch - '0'));
            }

            ans += Math.abs(freq.get(ch) - freq.getOrDefault(mirror, 0));

            visited.add(ch);
            visited.add(mirror);
        }

        return ans;
    }
}