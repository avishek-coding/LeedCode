class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> ans = new HashMap<>();

        for(String s : strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String temp = new String(c);
            if(!ans.containsKey(temp)){
                ans.put(temp, new ArrayList<>());
            }
            ans.get(temp).add(s);
            
        }
        return new ArrayList<>(ans.values());
    }
}