class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < s.length()) {
            if (right < s.length() && !map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), right);
                right++;
                max = right-left > max ? right-left : max;
            }
            if (right < s.length() && map.containsKey(s.charAt(right))) {
                int temp = left;
                left = map.get(s.charAt(left)) + 1;
                map.remove(s.charAt(temp));
            }
        }
        return max;
    }
}
