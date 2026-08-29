class Solution {
    public int thirdMax(int[] nums) {

        long largest = Long.MIN_VALUE;
        long secLargest = Long.MIN_VALUE;
        long thirdLar = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++) {


            if(nums[i] == largest || 
               nums[i] == secLargest || 
               nums[i] == thirdLar) {
                continue;
            }

            
            if(nums[i] > largest) {
                thirdLar = secLargest;
                secLargest = largest;
                largest = nums[i];
            }

            
            else if(nums[i] > secLargest) {
                thirdLar = secLargest;
                secLargest = nums[i];
            }

        
            else if(nums[i] > thirdLar) {
                thirdLar = nums[i];
            }
        }
        if(thirdLar == Long.MIN_VALUE){
            return(int) largest;
        }

        return (int)thirdLar;
    }
}