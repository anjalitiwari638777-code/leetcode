class Solution {
    public boolean canMake(int[] bloomDay,int day,int m,int k){
        int flower=0;
        int bouquets = 0;
        for(int i : bloomDay){
            if(i<=day){
                flower++;
            }
            else{
                bouquets+=flower/k;
                flower = 0;
            }
        }
            bouquets+=flower/k;
            return bouquets>=m;

        
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long) m*k>bloomDay.length)
            return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE; 
        for(int day:bloomDay){
            low = Math.min(low,day);
            high = Math.max(high,day);
        }   
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canMake(bloomDay,mid,m,k)){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
        
        
    }
}