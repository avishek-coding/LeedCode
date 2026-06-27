class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
      int s1=0;
      int e1=nums1.length-1;

      int s2=0;
      int e2=nums2.length-1;

      while(s1<=e1 && s2<=e2){
        if(nums1[s1]==nums2[s2]){
            return nums1[s1];
        }

        else if(nums1[s1]<nums2[s2]){
            s1++;
        }
        else{
            s2++;
        }
     
    }
     return -1;
    }
}
