// Last updated: 10/19/2025, 4:58:41 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        Map<Character, List<Integer>> charIndices = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            charIndices.putIfAbsent(c, new ArrayList<>());
            charIndices.get(c).add(i);
        }

        int prevIndex = -1;
        for (char c : s.toCharArray()) {
            if (!charIndices.containsKey(c)) return false;

            List<Integer> indices = charIndices.get(c);
            int nextIndex = Collections.binarySearch(indices, prevIndex + 1);
            if (nextIndex < 0) nextIndex = -nextIndex - 1;

            if (nextIndex == indices.size()) return false;
            prevIndex = indices.get(nextIndex);
        }
        return true;
    }
}
