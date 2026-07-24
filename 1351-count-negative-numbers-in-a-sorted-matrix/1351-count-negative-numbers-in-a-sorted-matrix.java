class Solution {
    public int countNegatives(int[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {

            int l = 0;
            int r = cols - 1;

            while (l <= r) {

                int mid = l + (r - l) / 2;

                if (grid[i][mid] < 0) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

            
            count += cols - l;
        }

        return count;
    }
}