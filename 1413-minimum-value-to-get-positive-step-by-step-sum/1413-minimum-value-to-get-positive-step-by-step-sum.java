class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int minsum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            minsum=Math.min(sum,minsum);
        }
        return 1-minsum;
    }
}