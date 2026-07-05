class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int total=0;
        //calculate the frequency
        for(int element : nums){
            map.put(element, map.getOrDefault(element, 0)+1);
        }
        //check the frequency
        for(Map.Entry<Integer, Integer> element: map.entrySet()){
            if(element.getValue()==1){
                total+=element.getKey();
            }
        }
        return total;
    }
}