class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int product=1;
        for(int i=0; i<s.length(); i++){
            char digit=s.charAt(i);
            int rev = 26-(digit-'a');
            product = rev*(i+1);
            
            sum+=product;
        }
        return sum;
    }
}