class Solution {
    public int majorityElement(int[] nums) {
       int count = 0;
       int candidate = 0;

       for(int num : nums){
            candidate=num;

            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
       }
       return candidate;
    }
}