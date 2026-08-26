class Solution {
    public int countTriplets(int[] arr) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> sum = new HashMap<>();

        int xor = 0;
        int ans = 0;

        // Prefix XOR = 0 exists at index 0
        count.put(0, 1);
        sum.put(0, 0);

        for (int i = 0; i < arr.length; i++) {
            xor ^= arr[i];

            if (count.containsKey(xor)) {
                ans += i * count.get(xor) - sum.get(xor);
            }

            // Store prefix position i + 1
            count.put(xor, count.getOrDefault(xor, 0) + 1);
            sum.put(xor, sum.getOrDefault(xor, 0) + (i + 1));
        }

        return ans;
    }
}