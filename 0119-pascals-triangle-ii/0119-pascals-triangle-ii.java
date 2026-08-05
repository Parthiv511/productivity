class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ansi = new ArrayList<>();
          long ans= 1;
            ansi.add((int)ans);
           for(int col=1;col<rowIndex;col++){
            ans = ans * (rowIndex-col+1);
             ans = ans/(col);
             ansi.add((int)ans);
           }
           if(rowIndex !=0)
           ansi.add(1);
           return ansi;
    }
}