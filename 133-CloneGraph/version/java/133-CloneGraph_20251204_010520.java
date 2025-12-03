// Last updated: 12/4/2025, 1:05:20 AM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6    public Node() {
7        val = 0;
8        neighbors = new ArrayList<Node>();
9    }
10    public Node(int _val) {
11        val = _val;
12        neighbors = new ArrayList<Node>();
13    }
14    public Node(int _val, ArrayList<Node> _neighbors) {
15        val = _val;
16        neighbors = _neighbors;
17    }
18}
19*/
20
21class Solution {
22    private Map<Node, Node> visited = new HashMap<>();
23
24    public Node cloneGraph(Node node) {
25        if (node == null) return null;
26
27        if (visited.containsKey(node)) {
28            return visited.get(node);
29        }
30
31        Node clone = new Node(node.val, new ArrayList<>());
32
33        visited.put(node, clone);
34
35        for (Node neighbor : node.neighbors) {
36            clone.neighbors.add(cloneGraph(neighbor));
37        }
38
39        return clone;
40    }
41}
42