class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank = new int[26];

        for (int i = 0; i < order.length(); i++) {
            rank[order.charAt(i) - 'a'] = i;
        }

        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String curr = words[i];

            int len = Math.min(prev.length(), curr.length());

            int j = 0;
            while (j < len) {
                int r1 = rank[prev.charAt(j) - 'a'];
                int r2 = rank[curr.charAt(j) - 'a'];

                if (r1 < r2) {
                    break;
                }
                if (r1 > r2) {
                    return false;
                }
                j++;
            }
            if (j == len && prev.length() > curr.length()) {
                return false;
            }
        }
        return true;
    }
}