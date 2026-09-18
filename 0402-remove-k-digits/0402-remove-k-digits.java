class Solution {
    public String removeKdigits(String nums, int k) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<nums.length(); i++){
            char digit = nums.charAt(i);
            while(!stack.isEmpty() && k>0 && stack.peek()>digit){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }
        while(k>0){
            stack.pop();
            k--;
        }
        if(stack.isEmpty()) return "0";
        StringBuilder st = new StringBuilder();
        while(!stack.isEmpty()){
            st.append(stack.pop());
        }
        while(st.length()>0 && st.charAt(st.length()-1)=='0'){
            st.deleteCharAt(st.length()-1);
        }

        if(st.length()==0) return "0";
        st.reverse();

        return st.toString();
    }
}