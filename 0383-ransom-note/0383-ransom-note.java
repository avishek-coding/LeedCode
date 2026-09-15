class Solution {
    public boolean canConstruct(String r, String m) {
        int[] count = new int[26];
        
        for(char c : m.toCharArray()){
            count[c -'a']++;
        }
        for(char c : r.toCharArray()){
            count[c -'a']--;
            if(count[c - 'a']<0) return false;
        }
        return true;
    }
}