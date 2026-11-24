class Solution {
    public int maxLength(int[] nums) {
        int maxLength = 0;
        for(int i=0; i<nums.length; i++){
            int product = 1;
            int gcd = 0;
            int lcm = 1;
            for(int j=i; j<nums.length; j++){
                product*=nums[j];
                gcd=GCD(gcd,nums[j]);
                lcm=LCM(lcm,nums[j]);

                if(product == gcd*lcm){
                    maxLength=Math.max(maxLength, j-i+1);
                }
            }
        }
        return maxLength;
    }
    public int GCD(int a, int b){
        while(b!=0){
            int temp=b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public int LCM(int a, int b){
        return (a / GCD(a,b)) * b;
    }
}