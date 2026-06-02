class Solution {
    public int[] minDistinctFreqPair(int[] nums) {

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> values = new ArrayList<>(freq.keySet());
        Collections.sort(values);

        int n = values.size();

        for (int i = 0; i < n; i++) {
            int x = values.get(i);

            for (int j = i + 1; j < n; j++) {
                int y = values.get(j);

                if (!freq.get(x).equals(freq.get(y))) {
                    return new int[]{x, y};
                }
            }
        }

        return new int[]{-1, -1};
    }
}