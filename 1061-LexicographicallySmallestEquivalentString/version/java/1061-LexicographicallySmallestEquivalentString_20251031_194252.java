// Last updated: 10/31/2025, 7:42:52 PM
class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        UnionFind uf = new UnionFind();

        for (int i = 0; i < s1.length(); i++) {
            uf.union(s1.charAt(i), s2.charAt(i));
        }

        StringBuilder ans = new StringBuilder();

        for (char c : baseStr.toCharArray()) {
            ans.append(uf.find(c));
        }

        return ans.toString();
    }

    private static class UnionFind {
        private final char[] parent;

        public UnionFind() {
            parent = new char[26];
            for (char c = 'a'; c <= 'z'; c++) {
                parent[c - 'a'] = c;
            }
        }

        public char find(char c) {
            if (parent[c - 'a'] != c)
                parent[c - 'a'] = find(parent[parent[c - 'a'] - 'a']);
            return parent[c - 'a'];
        }

        public void union(char a, char b) {
            char rootA = find(a);
            char rootB = find(b);
            char min = (char) Math.min(rootA, rootB);
            char max = (char) Math.max(rootA, rootB);
            parent[max - 'a'] = min;
        }
    }
}
