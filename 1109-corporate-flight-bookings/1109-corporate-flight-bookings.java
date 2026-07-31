class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
    int a[] = new int[n];
        for(int i=0;i<bookings.length;i++){
            int l = bookings[i][0];
            int r = bookings[i][1];
            while(l<=r){
                a[l-1] += bookings[i][2];
                l++;
            }
        }
        return a;
    }
}