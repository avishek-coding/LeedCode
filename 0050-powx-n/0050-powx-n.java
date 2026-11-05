class Solution {
    public double myPow(double x, int n) {

        long N = Math.abs((long)n);

        double pow = 1;

        while(N != 0) {

            if((N & 1) != 0) {
                pow *= x;
            }

            x *= x;
            N >>= 1;
        }

        if(n < 0) {
            return 1 / pow;
        }

        return pow;
    }
}