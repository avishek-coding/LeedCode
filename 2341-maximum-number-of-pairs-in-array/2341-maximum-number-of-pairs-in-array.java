class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element : nums){
            map.put(element, map.getOrDefault(element, 0) + 1);
        }

        int pairs=0;
        int leftovers=0;
        for(int freq : map.values()){
            pairs+=freq/2;
            leftovers+=freq%2;
        }

        return new int[]{pairs, leftovers};
    }
}