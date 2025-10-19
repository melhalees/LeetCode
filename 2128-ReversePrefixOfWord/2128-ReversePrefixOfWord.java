// Last updated: 10/19/2025, 4:58:18 AM
class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) return word;

        StringBuilder sb = new StringBuilder(word.substring(0, idx + 1));
        sb.reverse();
        sb.append(word.substring(idx + 1));

        return sb.toString();
    }
}
