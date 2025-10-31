// Last updated: 10/31/2025, 7:39:48 PM
class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        UnionFind uf = new UnionFind();

        for (int i = 0; i < s1.length(); i++) {
            uf.union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }

        StringBuilder ans = new StringBuilder();

        for (int j = 0; j < baseStr.length(); j++) {
            ans.append((char) (uf.find(baseStr.charAt(j) - 'a') + 'a'));
        }

        return ans.toString();
    }

    private class UnionFind {
        private final int[] parent;

        public UnionFind() {
            parent = new int[26];

            for (int i = 0; i < 26; i++) {
                parent[i] = i;
            }
        }

        public int find(int c) {
            if (parent[c] != c) parent[c] = find(parent[c]);

            return parent[c];
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) return;

            if (rootX < rootY) {
                parent[rootY] = rootX;
            } else {
                parent[rootX] = rootY;
            }
        }
    }
}