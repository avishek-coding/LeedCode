class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] str=sentence.split(" ");
        int n=str.length;
        
        for(int i=0; i<n; i++){
            if(str[i].startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}