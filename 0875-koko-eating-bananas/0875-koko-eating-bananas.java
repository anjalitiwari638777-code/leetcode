class Solution {
    public static int findMax(int[]piles){
        int max = piles[0];
        for(int x:piles){
            if(x>max){
                max=x;
            }
        }
        return max;
    }
    public static long totalHours(int[]piles,int k){
        long hours = 0;
        for(int i:piles){
            hours+=(i+k-1)/k;
        }
        return hours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high = findMax(piles);
        while(low<=high){
            int mid =low+(high-low)/2;
            long hours =totalHours(piles,mid);
            if(hours<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }
}