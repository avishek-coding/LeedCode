class Solution {
    public int waysToSplit(int[] nums) {
        int n=nums.length;
        int mod = 1000000007;
        long[] prefix= new long[n+1];
        long ans=0;

        for(int i=0; i<n; i++){
            prefix[i+1]=prefix[i]+nums[i];
        }

        long total=prefix[n];
        for (int i = 1; i <= n-2; i++) {

            int left = lowerBound(prefix, i + 1, n - 1, 2L * prefix[i]);
            int right = upperBound(prefix, i + 1, n - 1, (total + prefix[i]) / 2);

            if (left < right) {
                ans = (ans + (right - left)) % mod;
            }
        }
        return (int) ans;
    }


    //CREATING A FUNCTION FOR LOWER BOUND
    private int lowerBound(long[] arr, int left, int right, long target){
        int ans=right+1;
        while(left<=right){
            int mid= left+(right-left)/2;

            if(arr[mid]>=target){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }


     //CREATING A FUNCTION FOR UPPER BOUND
    private int upperBound(long[] arr, int left, int right, long target){
         int ans=right+1;
        while(left<=right){
            int mid= left+(right-left)/2;

            if(arr[mid]>target){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}