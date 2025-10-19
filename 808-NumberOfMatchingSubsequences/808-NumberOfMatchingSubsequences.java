// Last updated: 10/19/2025, 4:58:36 AM
import java.util.*;

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<Character, List<String>> buckets = new HashMap<>();

        for (char c = 'a'; c <= 'z'; c++) {
            buckets.put(c, new ArrayList<>());
        }

        for (String word : words) {
            buckets.get(word.charAt(0)).add(word.substring(1));
        }

        int count = 0;

        for (char c : s.toCharArray()) {
            List<String> currentBucket = buckets.get(c);
            buckets.put(c, new ArrayList<>());

            for (String suffix : currentBucket) {
                if (suffix.isEmpty()) {
                    count++;
                } else {
                    buckets.get(suffix.charAt(0)).add(suffix.substring(1));
                }
            }
        }

        return count;
    }
}
