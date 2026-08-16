class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == 2147483647 && divisor == -1){
            return -2147483647;
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
       int count = 0;
    boolean neg = (dividend < 0) != (divisor < 0);
   long a = dividend;
   long b = divisor; 
    a = Math.abs(a);
    b = Math.abs(b);
    while(a >= b){
        a -= b;
        count++;
    }
    if(neg){
        count = -count;
    }
    return count;
    }
}
