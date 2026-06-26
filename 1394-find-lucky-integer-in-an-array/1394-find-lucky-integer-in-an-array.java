class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer, Integer> map= new HashMap<>();
       int ans=-1;

       for(int nums : arr){
            map.put(nums, map.getOrDefault(nums, 0)+1);
       }

       for(int nums : arr){
            int freq=map.get(nums);

            if(nums==freq){
                if(ans<nums){
                    ans=nums;
                }
            }
       }
        return ans;
    }
}