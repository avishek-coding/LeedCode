class Solution {
    public void moveZeroes(int[] nums) {
        int start=0;
        int end=nums.length-1;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[start]=nums[i];
                start++;
            }
        }

        while(start<=end){
            nums[start]=0;
            start++;
        }
    }
}