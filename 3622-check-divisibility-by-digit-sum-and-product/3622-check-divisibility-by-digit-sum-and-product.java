class Solution {
    public boolean checkDivisibility(int n) {
        int s = 0, p=1;
        int or = n;
        while(n>0){
            int rem = n%10;
            s = s+rem;
            p = p*rem;
            n = n/10;
        }
        if(or%(s+p)==0)
         return true;
        else
        return false;
    }
}