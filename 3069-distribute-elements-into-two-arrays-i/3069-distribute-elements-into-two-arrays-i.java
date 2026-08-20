class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];

        arr1[0]=nums[0];
        arr2[0]=nums[1];

        int index1=1;
        int index2=1;

        for(int i=2; i<n; i++){
            if(arr1[index1-1]>arr2[index2-1]){
                arr1[index1]=nums[i];
                index1++;
            }
            else{
                arr2[index2]=nums[i];
                index2++;
            }
        }
        int[] result = new int[n];
            
            for(int i=0; i<index1; i++){
                result[i]=arr1[i];
            }
            for(int i=0; i<index2; i++){
                result[index1+i]=arr2[i];
        
            }   
        return result;
    }
    
}