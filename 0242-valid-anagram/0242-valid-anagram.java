class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Count characters of s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Subtract characters of t
        for (char c : t.toCharArray()) {

            if (!map.containsKey(c)) {
                return false;
            }

            map.put(c, map.get(c) - 1);
        }

        // Check all frequencies
        for (int count : map.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}