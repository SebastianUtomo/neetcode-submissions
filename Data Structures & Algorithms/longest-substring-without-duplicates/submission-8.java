class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < s.length()) {
            if (right < s.length() && map.containsKey(s.charAt(right)) && map.get(s.charAt(right)) >= left) {
                left = map.get(s.charAt(right)) + 1;
            }
            map.put(s.charAt(right), right);
            right++;
            max = right-left > max ? right-left : max;            
        }
        return max;
    }
}
