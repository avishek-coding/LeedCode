class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans = new int[nums.length];

        int positive = 0;
        int negitive = 1;

        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0){
                ans[positive]=nums[i];
                positive+=2;
            }
            else{
                ans[negitive]=nums[i];
                negitive+=2;
            }
        }
        return ans;
    }
}