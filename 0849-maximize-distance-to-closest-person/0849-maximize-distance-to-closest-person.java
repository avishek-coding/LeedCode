class Solution {
    public int maxDistToClosest(int[] seats) {
        int n = seats.length;
        int maxDistance = 0;
        int prevOccupied = -1;

        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                if (prevOccupied == -1) {
                    maxDistance = i;
                } else {
                    maxDistance = Math.max(maxDistance, (i - prevOccupied) / 2);
                }
                prevOccupied = i;
            }
        }
        maxDistance = Math.max(maxDistance, n - 1 - prevOccupied);

        return maxDistance;
    }
}