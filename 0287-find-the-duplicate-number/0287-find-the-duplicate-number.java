class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();

        for(int element : nums){
            map.put(element, map.getOrDefault(element,0)+1);
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){

            if(entry.getValue()>1){
                return entry.getKey();
            }
        }
        return -1;
    }
}