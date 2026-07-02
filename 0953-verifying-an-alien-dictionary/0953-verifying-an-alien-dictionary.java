class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map= new HashMap<>();

        for(int i=0;i<order.length(); i++){
            map.put(order.charAt(i), i);
        }

        for(int i=1; i<words.length; i++){
            String a=words[i-1];
            String b= words[i];

            for(int j=0; j<a.length(); j++){
                if(j==b.length()){
                    return false;
                }
                char a_char=a.charAt(j);
                char b_char=b.charAt(j);

                if(map.get(a_char)<map.get(b_char)){
                    break;
                }
                if(map.get(a_char)> map.get(b_char)){
                    return false;
                }
            }
        }
        return true;
    }
}