// Last updated: 12/3/2025, 3:55:20 PM
1class Trie {
2    static class TrieNode {
3        TrieNode[] children;
4        boolean isEndOfWord;
5
6        TrieNode() {
7            children = new TrieNode[26]; 
8            isEndOfWord = false;
9        }
10    }
11
12    private TrieNode root;
13
14    public Trie() {
15        root = new TrieNode();
16    }
17    
18    public void insert(String word) {
19        TrieNode current = root;
20
21        char c;
22        
23        for (int i = 0; i < word.length(); i++) {
24            c = word.charAt(i);
25
26            if (current.children[c - 'a'] == null) {
27                current.children[c - 'a'] = new TrieNode();
28            }
29
30            current = current.children[c - 'a'];
31        }
32
33        current.isEndOfWord = true;
34    }
35    
36    public boolean search(String word) {
37        TrieNode current = root;
38      
39        for (int i = 0; i < word.length(); i++) {
40            char ch = word.charAt(i);
41          
42            if (current.children[ch - 'a'] == null) {
43                return false; 
44            }
45          
46            current = current.children[ch - 'a'];
47        }
48
49        return current != null && current.isEndOfWord;
50    }
51    
52    public boolean startsWith(String prefix) {
53        TrieNode current = root;
54
55        for (int i = 0; i < prefix.length(); i++) {
56            char ch = prefix.charAt(i);
57          
58            if (current.children[ch - 'a'] == null) {
59                return false; 
60            }
61          
62            current = current.children[ch - 'a'];
63        }
64        return true;
65    }
66}
67
68/**
69 * Your Trie object will be instantiated and called as such:
70 * Trie obj = new Trie();
71 * obj.insert(word);
72 * boolean param_2 = obj.search(word);
73 * boolean param_3 = obj.startsWith(prefix);
74 */