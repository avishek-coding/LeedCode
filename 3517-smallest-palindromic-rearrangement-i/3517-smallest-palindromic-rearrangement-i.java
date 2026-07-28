class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
         int mid=s.length()/2;
        
        String firstHalf=s.substring(0,mid);
        char[] arr=firstHalf.toCharArray();
        Arrays.sort(arr);

        String sortedHalf=new String(arr);
        StringBuilder ans=new StringBuilder();

        ans.append(sortedHalf);

        if(s.length()%2==1){
            ans.append(s.charAt(mid));
        }

        for(int i=arr.length-1; i>=0; i--){
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}