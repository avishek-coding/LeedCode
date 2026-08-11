class Solution {

    private int product(int n){
        int ans=0;
        while(n!=0){
            int digit=n%10;
            ans+=digit * digit;
            n/=10;
        }
        return ans;
    }

    public boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
            slow=product(slow);
            fast=product(product(fast));
        }while(fast != slow);

        if(slow == 1){
            return true;  
        }
        return false;
    }
}