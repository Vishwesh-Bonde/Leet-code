class Solution {
    public int divide(int dividend, int divisor) {
        int result = 0;
        int dividend_sign = 1;
        int divisor_sign = 1;

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);

        if(divisor < 0){
             divisor_sign = -1 ;
        }

        if(dividend < 0){
             dividend_sign = -1 ;
        }
        
        if(divisor == 1){
           return dividend;
            
        }
        if(divisor == -1){
            return dividend* -1;
        }

        while (absDividend >= absDivisor) {
            absDividend = absDividend - absDivisor; 
            result++; 
        }


        result = result * dividend_sign * divisor_sign;


        if(result < Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        if(result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        return result;
    }
}