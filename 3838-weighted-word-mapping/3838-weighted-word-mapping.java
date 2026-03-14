class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder parth = new StringBuilder();

        for (String wdf : words) {
            int twfs = 0;

        
            for (char chkl : wdf.toCharArray()) {
                twfs += weights[chkl - 'a'];
            }

      
            int modfg = twfs % 26;

            
            char mcfs = (char) ('z' - modfg);

            parth.append(mcfs);
        }

        return parth.toString();
    }
}