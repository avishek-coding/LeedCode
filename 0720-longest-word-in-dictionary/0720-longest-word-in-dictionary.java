class Solution {
    public String longestWord(String[] words) {
       HashSet<String> set=new HashSet<>();

        String result="";
       Arrays.sort(words);
       for(String s : words){
        if(s.length()== 1 || set.contains(s.substring(0, s.length()-1))){
            set.add(s);
            if(s.length() >result.length()){
                result=s;
                
            }
        }
       }
        return result;
    }
}