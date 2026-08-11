class Solution {
    public int missingInteger(int[] nums) {
        int ans=nums[0];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]+1== nums[i+1]){
                ans+=nums[i+1];
            }
            else{
                break;
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        while(set.contains(ans)){
            ans++;
        }
        return ans;
    }
}