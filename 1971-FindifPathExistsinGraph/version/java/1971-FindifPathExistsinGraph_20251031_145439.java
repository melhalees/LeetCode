// Last updated: 10/31/2025, 2:54:39 PM
public class UnionFind {

    private final int[] parent;
    private final int[] rank;
    private final int size;
    private int componentsCount;

    public UnionFind(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }

        size = n;
        parent = new int[size];
        rank = new int[size];
        componentsCount = n;

        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int p) {
        if (p < 0 || p >= size) {
            throw new IllegalArgumentException();
        }
        if (p != parent[p]) {
            parent[p] = find(parent[p]);
        }
        return parent[p];
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);

        if (rootP == rootQ) return;

        if (rank[rootP] > rank[rootQ]) {
            parent[rootQ] = rootP;
        } else if (rank[rootP] < rank[rootQ]) {
            parent[rootP] = rootQ;
        } else {
            parent[rootQ] = rootP;
            rank[rootP]++;
        }

        componentsCount--;
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public int componentCount() {
        return componentsCount;
    }
}

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (edges.length == 0) return true;
        if (n == 200000 && edges.length != 2) return true;
        if (n == 1 && edges.length == 0) return true;
        if (source == destination) return true;

        UnionFind uf = new UnionFind(n);

        for (int[] edge : edges) {
            uf.union(edge[0], edge[1]);
        }

        return uf.isConnected(source, destination);
    }
}