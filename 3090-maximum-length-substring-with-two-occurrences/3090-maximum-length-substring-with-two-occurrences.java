class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int ans=0;
        int[] count = new int[26];

        for(int right=0;right < s.length(); right++){
            count[s.charAt(right)-'a']++;

            while(count[s.charAt(right)- 'a']>2){
                count[s.charAt(left)-'a']--;
                left++;
            }

            int windowSize=right-left+1;

            ans=Math.max(ans,windowSize);
        }
        return ans;
    }
}