
class Solution {
    public int myAtoi(String s) {
        int i=0;
        int n = s.length();

        while(i<n && s.charAt(i)==' '){
            i++;
        }

        int sign = 1;

        if(i<n && s.charAt(i)=='-'){
            sign = -1;
            i++;
        }else if(i<n && s.charAt(i)=='+'){
            i++;
        }

        int num =0;

        int limit = (sign==1) ? -Integer.MAX_VALUE : Integer.MIN_VALUE;

        while(i<n && s.charAt(i)>='0' && s.charAt(i)<='9'){
            int digit = s.charAt(i)-'0';

            if(num < limit/10){
                return (sign==1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num*10;

            if(num < limit+digit){
                return (sign==1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            num = num-digit;
            i++;
        }

        return (sign==1) ? -num : num;
    }
}
