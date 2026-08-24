class Solution {
    public int[] findRightInterval(int[][] intervals) { 
        int n=intervals.length;
        int[] arr = new int[n];
        int[] ans = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=intervals[i][0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i],i);
        }
        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            int val=BinarySearch(arr, intervals[i][1]);
            if(val==-1){
                ans[i]=-1;
            }
            else{
                ans[i]=map.get(arr[val]);
            }
        }
        return ans;
    }

    public int BinarySearch(int[] arr, int target){
        int left=0;
        int right=arr.length-1;
        int ans=-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }

        return ans;
    }
}