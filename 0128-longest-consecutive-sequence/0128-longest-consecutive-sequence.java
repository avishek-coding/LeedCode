class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            if(!set.contains(num-1)){
                int length = 1;
                while(set.contains(num + length)){
                    length++;
                }
                count = Math.max(length, count);
            }
            
        }
        return count;
    }
    
    
}