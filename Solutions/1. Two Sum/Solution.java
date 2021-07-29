/*
  Runtime: 1 ms, faster than 99.54% of Java online submissions for Two Sum.
  Memory Usage: 38.8 MB, less than 92.60% of Java online submissions for Two Sum.
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> set = new HashMap<Integer, Integer>();
        
        for (int i = -1; ++i < nums.length;) {
            if (set.containsKey(target-nums[i])) {
                return new int[] {set.get(target-nums[i]), i};
            }
            set.put(nums[i], i);
        }
        
        return null; 
    }
}
