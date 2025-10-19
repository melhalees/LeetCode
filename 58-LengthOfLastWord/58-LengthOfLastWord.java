// Last updated: 10/19/2025, 4:59:05 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        
        while (i >= 0 && s.charAt(i) == ' ') i--;
        
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        
        return length;
    }
}