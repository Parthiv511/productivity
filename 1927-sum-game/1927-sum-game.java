class Solution {
    public boolean sumGame(String num) {

int ls = 0;
        int rs = 0;

        int lq = 0;
        int rq = 0;

        int n = num.length();

        for (int i = 0; i < n / 2; i++) {

            if (num.charAt(i) == '?') {
                lq++;
            } else {
                ls += num.charAt(i) - '0';
            }
        }

        for (int i = n / 2; i < n; i++) {

            if (num.charAt(i) == '?') {
                rq++;
            } else {
                rs += num.charAt(i) - '0';
            }
        }

        
        if ((lq + rq) % 2 == 1) {
            return true;
        }

        if(ls - rs != 9 * (rq - lq) / 2){
            return true;
        }
        else{
            return false;
        }
    }
}