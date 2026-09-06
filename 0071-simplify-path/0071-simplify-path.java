class Solution {
    public String simplifyPath(String path) {
        String[] component=path.split("/");
        Stack<String> stack = new Stack<>();
        for(String s : component){
            if(s.equals("") || s.equals(".")) continue;

            if(s.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(s);
                
            }
        }
        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty()){
            str.insert(0, "/"+stack.pop());
        }
        if(str.length()==0){
            return "/";
        }else{ 
            return str.toString();
        }

    }
}