class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int r=nums.length/3;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer, Integer> val : map.entrySet()){
            if(val.getValue()> r){
                list.add(val.getKey());
            }
        }
        return list;
    }
}