// Last updated: 10/19/2025, 6:46:20 AM
class Solution {
    static {
        for(int i = 0; i<200;i++)
            firstUniqChar("");
    }
    public static int firstUniqChar(String s) {
        int frq[] = new int[26], ind[] = new int[26];
        Arrays.fill(ind, -1);
        char ch;
        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            frq[ch-'a']++;
            if(ind[ch-'a']<0)
                ind[ch-'a'] = i;
        }

        int res = Integer.MAX_VALUE;
        for(int i=0; i<26; i++){
            if(frq[i]==1)
                res = Math.min(res, ind[i]);
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}