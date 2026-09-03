class Solution {
    public boolean uniformArray(int[] nums) {
       int min=nums[0];

       for(int n : nums){
        if(n<min){
            min=n;
        }
       }

       if(min%2 != 0){
        return true;
       }
       else{
        for(int n: nums){
            if(n%2 !=0){
                return false;
            }
        }
       }
       return true;
    }
}