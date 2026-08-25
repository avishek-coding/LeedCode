class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int n=nums.length;
        for(int num : nums){
            set.add(num);
        }
        int i=1;
        while(true){
            if(set.contains(k*i)){
               i++;
            }
            else{
                return  k*i;
            }
        }
       
    }
}