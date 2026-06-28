class Solution{
 private boolean canSplit(int[] nums, int k, long maxSum) {
        int count = 1;
        long sum = 0;

        for (int num : nums) {

            if (num > maxSum) return false;

            if (sum + num > maxSum) {
                count++;
                sum = num;

                if (count > k) return false;
            } else {
                sum += num;
            }
        }

        return true;
    }

    public int splitArray(int[] nums, int k) {

        long low = 0, high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canSplit(nums, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }
}
        
