// Last updated: 12/3/2025, 4:14:50 PM
1class TrieNode {
2    Map<Character, TrieNode> children;
3    boolean isEnd;
4
5    TrieNode() {
6        children = new HashMap<>();
7        isEnd = false;
8    }
9}
10
11class Trie {
12    private TrieNode root;
13
14    public Trie() {
15        root = new TrieNode();
16    }
17
18    public void insert(String word) {
19        TrieNode node = root;
20        for (char c : word.toCharArray()) {
21            node.children.putIfAbsent(c, new TrieNode());
22            node = node.children.get(c);
23        }
24        node.isEnd = true;
25    }
26
27    public boolean search(String word) {
28        return dfsSearch(root, word, 0);
29    }
30
31    private boolean dfsSearch(TrieNode node, String word, int index) {
32        if (node == null) return false;
33        if (index == word.length()) return node.isEnd;
34
35        char ch = word.charAt(index);
36
37        if (ch == '.') {
38            for (TrieNode child : node.children.values()) {
39                if (dfsSearch(child, word, index + 1)) return true;
40            }
41            return false;
42        } else {
43            return dfsSearch(node.children.get(ch), word, index + 1);
44        }
45    }
46}
47
48public class WordDictionary {
49    private Trie trie;
50
51    public WordDictionary() {
52        trie = new Trie();
53    }
54
55    public void addWord(String word) {
56        trie.insert(word);
57    }
58
59    public boolean search(String word) {
60        return trie.search(word);
61    }
62}
63
64/**
65 * Your WordDictionary object will be instantiated and called as such:
66 * WordDictionary obj = new WordDictionary();
67 * obj.addWord(word);
68 * boolean param_2 = obj.search(word);
69 */