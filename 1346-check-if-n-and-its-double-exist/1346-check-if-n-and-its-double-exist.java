class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean f = false;
         HashSet<Integer> s = new HashSet<>();
           for(int x : arr){
              if(s.contains(2*x)){
                return true;
              }
              if(s.contains(x/2)&& x%2==0){
                  return true;
              }
              s.add(x);
           }
           return false;
    }
}