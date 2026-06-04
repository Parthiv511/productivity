class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {

        int bestQuality = -1;
        int bestX = -1;
        int bestY = -1;

        int cx = center[0];
        int cy = center[1];

        for (int[] tower : towers) {

            int x = tower[0];
            int y = tower[1];
            int q = tower[2];

            int distance = Math.abs(x - cx) + Math.abs(y - cy);

            if (distance <= radius) {

                if (q > bestQuality) {

                    bestQuality = q;
                    bestX = x;
                    bestY = y;

                } else if (q == bestQuality) {

                    if (x < bestX || (x == bestX && y < bestY)) {

                        bestX = x;
                        bestY = y;
                    }
                }
            }
        }

        return new int[]{bestX, bestY};
    }
}