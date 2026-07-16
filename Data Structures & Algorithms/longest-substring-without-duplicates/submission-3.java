class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < s.length()) {
            if (right < s.length() && !set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                max = right-left > max ? right-left : max;
            }
            while (right < s.length() && set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
