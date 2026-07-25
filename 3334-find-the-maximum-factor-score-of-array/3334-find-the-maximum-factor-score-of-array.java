class Solution {
    public long maxScore(int[] nums) {
        long ans=factScore(nums, -1);

        for(int i=0; i<nums.length; i++){
            ans=Math.max(ans,factScore(nums,i));
        }
        return ans;
    }


    //FIND THE FACTOR SCORE
    public long factScore(int[] nums, int removeIdx){
        long gcdValue=0;
        long lcmValue=1;
        boolean element=false;

        for(int i=0; i<nums.length; i++){
            if(i==removeIdx){
                continue;
            }

            if(!element){
                gcdValue=nums[i];
                lcmValue=nums[i];
                element=true;
            }
            else{
                gcdValue=gcd(gcdValue, nums[i]);
                lcmValue=lcm(lcmValue, nums[i]);
            }

        }
        if(!element){
            return 0;
        }

        return gcdValue * lcmValue;
    }
    //GCD OF TWO NUMBERS
    public long gcd(long a, long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    //LCM OF TWO NUMBERS
    public long lcm(long a, long b){
        return (a / gcd(a,b))*b;
    }
}