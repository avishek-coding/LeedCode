class Solution {
    public int minStartValue(int[] nums) {
        int total=0;
        int min=0;

        for(int element : nums){
            total+=element;
             min=Math.min(min, total);
        }

        return 1-min;
    }
}