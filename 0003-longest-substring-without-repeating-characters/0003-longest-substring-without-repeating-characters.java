class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] hash = new int[256];
        Arrays.fill(hash,-1);
        int left = 0;
        int maxlen = 0;
        for(int right = 0;right<s.length();right++){
            char ch = s.charAt(right);
            if(hash[ch]!=-1){
                left = Math.max(left,hash[ch]+1);
            }
            hash[ch] = right;
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;

        
    }
}