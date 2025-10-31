// Last updated: 10/31/2025, 8:23:53 PM
class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        UnionFind uf = new UnionFind(n);

        for (int[] edge : edges) {
            uf.union(edge[0], edge[1]);
        }

        int completeComponents = 0;

        for (int i = 0; i < n; i++) {
            if (uf.isRoot(i)) {
                int nodes = uf.getNodeCount(i);
                int edgesCount = uf.getEdgeCount(i);

                if (edgesCount == nodes * (nodes - 1) / 2) {
                    completeComponents++;
                }
            }
        }

        return completeComponents;
    }

    private static class UnionFind {

        private final int size;
        private int componentsCount;
        private final int[] parent;
        private final int[] rank;
        private final int[] nodeCount;
        private final int[] edgeCount;

        public UnionFind(int n) {
            size = n;
            componentsCount = n;

            parent = new int[n];
            rank = new int[n];
            nodeCount = new int[n];
            edgeCount = new int[n];

            for (int i = 0; i < n; i ++) {
                parent[i] = i;
                rank[i] = 1;
                nodeCount[i] = 1;
            }
        }

        public int find(int f) {
            if (parent[f] != f) parent[f] = find(parent[f]);

            return parent[f];
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) {
                edgeCount[rootX]++;
                return;
            }

            if (rank[rootX] > rank[rootY]) {
                parent[rootY] = rootX;
                nodeCount[rootX] += nodeCount[rootY];
                edgeCount[rootX] += (edgeCount[rootY] + 1);
            } else if (rank[rootY] > rank[rootX]) {
                parent[rootX] = rootY;
                nodeCount[rootY] += nodeCount[rootX];
                edgeCount[rootY] += (edgeCount[rootX] + 1);
            } else {
                parent[rootY] = rootX;
                rank[rootX]++;
                nodeCount[rootX] += nodeCount[rootY];
                edgeCount[rootX] += (edgeCount[rootY] + 1);
            }

            componentsCount--;
        }

        public boolean isRoot(int x) {
            return parent[x] == x;
        }

        public int getNodeCount(int x) {
            return nodeCount[x];
        }

        public int getEdgeCount(int x) {
            return edgeCount[x];
        }
    }
}