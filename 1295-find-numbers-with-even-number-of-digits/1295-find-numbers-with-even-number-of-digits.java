class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int word: nums){
           int digit = (int)(Math.log10(word))+1;
           if(digit % 2 == 0){
            count++;
           }
        }
        return count;
    }
}