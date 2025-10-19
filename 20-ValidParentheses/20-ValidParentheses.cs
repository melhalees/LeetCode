// Last updated: 10/19/2025, 4:59:14 AM
using System.Collections;

public class Solution {
    public bool IsValid(string s) {
        char[] openingParenthese = {'(', '{', '['};
        char[] closingParenthese = {')', '}', ']'};

        Stack stack = new Stack();

        for (int i = 0; i < s.Length; i++) {
            if (Array.IndexOf(openingParenthese, s[i]) != -1) {
                stack.Push(s[i]);
            } else {
                if (stack.Count == 0) { return false; }
                if (Array.IndexOf(openingParenthese, stack.Peek()) == Array.IndexOf(closingParenthese, s[i]) ) {
                    stack.Pop();
                } else {
                    return false;
                }
            }
        }

        if (stack.Count == 0) {
            return true;
        }  
        else {
            return false;
        } 

    }
}