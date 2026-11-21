class Solution {
    public int maxProduct(int[] nums) {
        int max =(nums[0]-1)*(nums[1]-1);
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
            int product = (nums[i]-1)*(nums[j]-1);
            if(product>max){
                max = product;
            }
            }
        }
        return max;

        
    }
}