class Solution {
    public long sumAndMultiply(int n) {

        long reversed = 0;
        long sum = 0;

        while (n > 0) {
            int digit = n % 10;

            if (digit != 0) {
                reversed = reversed * 10 + digit;
                sum += digit;
            }

            n /= 10;
        }

        long x = 0;

        while (reversed > 0) {
            x = x * 10 + (reversed % 10);
            reversed /= 10;
        }

        return x * sum;
    }
}