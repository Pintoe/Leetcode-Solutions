/*
  * Runtime: 16 ms, faster than 27.29% of Java online submissions for Find All Duplicates in an Array. 
  * Memory Usage: 47.6 MB, less than 90.08% of Java online submissions for Find All Duplicates in an Array.
/*

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> seenNumbers = new HashSet<Integer>();
        ArrayList<Integer> duplicateNumbers = new ArrayList<Integer>();
        
        for (int v : nums) {
            if (seenNumbers.contains(v)) {
                duplicateNumbers.add(v);
            } else {
                seenNumbers.add(v);
            }
        }

        return duplicateNumbers;
    }
}
