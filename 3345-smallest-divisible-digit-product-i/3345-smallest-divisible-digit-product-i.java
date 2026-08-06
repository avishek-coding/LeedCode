class Solution {
     public int product(int n){
        int product=1;
            while(n>0){    
                int digit=n%10;
                product*=digit;
                n/=10;
            }
        return product;
       }

       

    public int smallestNumber(int n, int t) {
        int x=n;
       while(true){
            if((product(x) % t)==0){
                return x;
            }
            else{
                x++;
            }
       }
    }
}