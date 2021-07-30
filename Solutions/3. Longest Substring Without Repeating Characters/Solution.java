/*
  * Runtime: 68 ms, faster than 17.49% of Java online submissions for Longest Substring Without Repeating Characters.
  * Memory Usage: 40 MB, less than 23.57% of Java online submissions for Longest Substring Without Repeating Characters.
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] c = s.toCharArray();
        String longestString = "";
        int longestLen = 0;
        int currentLen = 0;

        for (int i = -1; ++i < c.length;) {

            if (map.containsKey(c[i])) {
                if (currentLen > longestLen) {
                    longestLen = currentLen;
                }
                currentLen = 0;
                i = map.get(c[i])+1;
                map.clear();
            }

            map.put(c[i], i);
            currentLen += 1;
        }

        return longestLen > currentLen ? longestLen : currentLen;
    }
}
