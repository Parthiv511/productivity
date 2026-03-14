class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int paed = Integer.MAX_VALUE;
        int ibf= -1;

        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= itemSize && capacity[i] < paed) {
                paed = capacity[i];
                ibf = i;
            }
        }

        return ibf;
    }
}