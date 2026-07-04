class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res=0;
        int n=arr.length;

        for(int i=0; i<n; i++){
            int total = (i + 1) * (n - i);
            int oddCount = (total + 1) / 2;
            res += oddCount * arr[i];
        }
        return res;
    }
}