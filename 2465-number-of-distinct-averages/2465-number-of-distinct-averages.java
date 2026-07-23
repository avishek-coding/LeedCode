class Solution {
    public int distinctAverages(int[] nums) {
        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        HashSet<Integer> set = new HashSet<>();

        int low = 0;
        int high = 100;

        while (true) {
            while (low <= 100 && freq[low] == 0) low++;
            while (high >= 0 && freq[high] == 0) high--;

            if (low > high) break;

            set.add(low + high);
            freq[low]--;
            freq[high]--;
        }

        return set.size();
    }
}