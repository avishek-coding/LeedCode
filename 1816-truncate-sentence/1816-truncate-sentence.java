class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr=s.split(" ");
        String[] ans=new String[k];
        for(int i=0; i<k; i++){
            ans[i]=arr[i];
        }
        return String.join(" ", ans);
    }
}