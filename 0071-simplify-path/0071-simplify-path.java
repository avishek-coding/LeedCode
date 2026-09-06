class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] component = path.split("/");

        for(String s : component){
            if(s.equals("") || s.equals(".")) continue;

            if(s.equals("..")){
                if(!stack.isEmpty()) stack.pop();
            }
            else stack.push(s);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0, "/"+stack.pop());
        }
        return sb.length()==0 ? "/" : sb.toString();
    }
}