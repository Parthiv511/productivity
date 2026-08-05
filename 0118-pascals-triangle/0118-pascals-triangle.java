class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {

            long value = 1;
            List<Integer> row = new ArrayList<>();

            row.add(1);

            for (int col = 1; col < i; col++) {

                value = value * (i - col);
                value = value / col;

                row.add((int) value);
            }

            ans.add(row);
        }

        return ans;
    }
}