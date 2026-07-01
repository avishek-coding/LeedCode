class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0;
        int less=0;

        for(int s: nums){
            if(s==target) count++;
            if(s<target) less++;
        }

        ArrayList<Integer> list= new ArrayList<>();

        for(int i=0; i<count; i++){
            list.add(less++);
        }
        return list;
    }
}