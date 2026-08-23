class Solution {
    public int[] intersection(int[] nums1, int[] nums2){
         HashSet<Integer> set1 = new HashSet<>();

        // Store nums1
        for (int num : nums1) {
            set1.add(num);
        }

        HashSet<Integer> result = new HashSet<>();

        // Check nums2
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        // Convert HashSet to int[]
        int[] ans = new int[result.size()];
        int i = 0;

        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}