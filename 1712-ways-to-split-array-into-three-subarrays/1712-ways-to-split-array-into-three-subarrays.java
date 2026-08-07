class Solution {
    public int waysToSplit(int[] nums) {
        int n = nums.length;
        int MOD = 1_000_000_007;

        long[] pre = new long[n + 1];
        for (int i = 0; i < n; i++)
            pre[i + 1] = pre[i] + nums[i];

        long ans = 0;
        int j = 2, k = 2;

        for (int i = 1; i <= n - 2; i++) {

            if (j < i + 1) j = i + 1;
            while (j <= n - 1 && pre[j] - pre[i] < pre[i])
                j++;

            if (k < j) k = j;
            while (k <= n - 1 && pre[n] - pre[k] >= pre[k] - pre[i])
                k++;

            ans = (ans + (k - j)) % MOD;
        }

        return (int) ans;
    }
}