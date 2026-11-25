class Solution {
    int count = 0;
    public int[] Sort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left =Sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=Sort(Arrays.copyOfRange(arr, mid, arr.length));

        int j = 0;

        for (int i = 0; i < left.length; i++) {

            while (j < right.length &&
                   (long) left[i] > 2L * right[j]) {
                j++;
            }

            count += j;
        }

        return merge(left, right);
    }

    private int[] merge(int[] first, int[] second){
        int[] mix= new int[first.length+second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j<second.length){
            if(first[i]<=second[j]){
                mix[k]=first[i];
                i++;
            }
            else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;

    }

    public int reversePairs(int[] nums) {
        count = 0;
        Sort(nums);
        return count;
    }
}