class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int start=0;
        int end=nums.length-1;
        long ans=0;

        while(start<=end){
            if(start==end){
                ans+=nums[start];
            }
            else{
                String str=Integer.toString(nums[start]) + Integer.toString(nums[end]);
                ans+=Long.parseLong(str);
            }
            start++;
            end--;
        }
        return ans;
    }
}