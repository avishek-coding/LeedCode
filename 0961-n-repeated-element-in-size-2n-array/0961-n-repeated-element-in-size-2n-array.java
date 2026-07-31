class Solution {
    public int repeatedNTimes(int[] nums) {
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]==nums[i+1] || nums[i]==nums[i+2]){
                return nums[i];
            }

            if(nums[nums.length-2]==nums[nums.length-1]){
                return nums[nums.length-1];
            }
        }
        return nums[0];
    }
}