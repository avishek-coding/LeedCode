class Solution {
    public int removeDuplicates(int[] nums) {
       
        int n=nums.length;
        int tri=2;
        for(int i=2; i<n; i++){
            if(nums[i]!=nums[tri-2]){
                nums[tri] = nums[i];
                tri++;
            }
        }
       return tri;
    }
}