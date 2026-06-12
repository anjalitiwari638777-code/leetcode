class Solution {
    public double myPow(double x, int n) {
        return myPow(x,(long)n);
    }
    public double myPow(double x,long n){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 1/myPow(x,-n);
        }
        double hi=myPow(x,n/2);
        double hn=hi*hi;
        if(n%2!=0){
            hn=x*hi*hi;
        }
        return hn;
        
    }
}