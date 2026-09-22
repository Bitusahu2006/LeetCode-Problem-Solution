class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long a = dividend;
        long b = divisor;

        boolean negative = (a < 0) ^ (b < 0);

        a = Math.abs(a);
        b = Math.abs(b);

        long quotient = 0;

        while (a >= b) {
            long temp = b;
            long multiple = 1;

            while (a >= (temp << 1)) {
                temp = temp << 1;
                multiple = multiple << 1;
            }

            a = a - temp;
            quotient = quotient + multiple;
        }

        if (negative)
            quotient = -quotient;

        if (quotient > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (quotient < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) quotient;
    }
}