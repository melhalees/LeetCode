// Last updated: 10/19/2025, 4:58:38 AM
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }

    private void dfs(Node node, List<Integer> ans) {
        if (node == null) return;

        ans.add(node.val);
        if (node.children != null) {
            for (Node child : node.children) {
                dfs(child, ans);
            }
        }
    }
}