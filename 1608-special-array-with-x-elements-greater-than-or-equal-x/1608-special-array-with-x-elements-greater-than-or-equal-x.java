class Solution {
    public int specialArray(int[] nums) {
       int n= nums.length;
       int[] freq= new int[n+1];

       for(int element: nums){
        if(element>=n){
            freq[n]++;
        }
        else{
            freq[element]++;
        }

       }

       int count=0;
       for(int i=n; i>=0; i--){
        count+=freq[i];

        if(count==i){
            return i;
        }

       }
       return -1;
    }
}