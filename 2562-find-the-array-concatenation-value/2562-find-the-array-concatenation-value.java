class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        long ans = 0;

        while (start <= end) {
            if (start == end) {
                ans += nums[start];
            } else {
                long multiplier = 1;
                int temp = nums[end];
                do {
                    multiplier *= 10;
                    temp /= 10;
                } while (temp > 0);

                ans += (long) nums[start] * multiplier + nums[end];
            }
            start++;
            end--;
        }
        return ans;
    }
}