class Solution {
    public double trimMean(int[] arr) {
        int n=arr.length;
        int per=5*n/100;
        Arrays.sort(arr);
        int start = per;
        int end=n-per;

        double total=end-start;
        double sum=0;

        for(int i=start; i<end; i++){
            sum+=arr[i];
        }

        return sum/total;
    }
}