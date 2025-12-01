// Last updated: 12/1/2025, 5:03:40 PM
1class LRUCache {
2    static class DoublyNode {
3        int key;
4        int value;
5        DoublyNode prev;
6        DoublyNode next;
7
8        DoublyNode(int key, int value) {
9            this.key = key;
10            this.value = value;
11        }
12    }
13
14    private final int capacity;
15    private int currentCapacity;
16    private Map<Integer, DoublyNode> cache;
17    private DoublyNode mru;
18    private DoublyNode lru;
19
20    public LRUCache(int capacity) {
21        this.capacity = capacity;
22        this.currentCapacity = 0;
23        this.cache = new HashMap<>();
24
25        mru = new DoublyNode(-1, -1);
26        lru = new DoublyNode(-1, -1);
27
28        mru.next = lru;
29        lru.prev = mru;
30    }
31
32    private void removeNode(DoublyNode node) {
33        DoublyNode prevNode = node.prev;
34        DoublyNode nextNode = node.next;
35
36        prevNode.next = nextNode;
37        nextNode.prev = prevNode;
38    }
39
40    private void insertAtMRU(DoublyNode node) {
41        DoublyNode firstRealNode = mru.next;
42
43        mru.next = node;
44        node.prev = mru;
45
46        node.next = firstRealNode;
47        firstRealNode.prev = node;
48    }
49
50    public int get(int key) {
51        DoublyNode node = cache.get(key);
52
53        if (node == null)
54            return -1;
55
56        removeNode(node);
57        insertAtMRU(node);
58
59        return node.value;
60    }
61
62    public void put(int key, int value) {
63        if (cache.containsKey(key)) {
64            DoublyNode node = cache.get(key);
65            node.value = value;
66
67            removeNode(node);
68            insertAtMRU(node);
69
70            return;
71        }
72
73        if (currentCapacity == capacity) {
74            DoublyNode lruNode = lru.prev;
75            removeNode(lruNode);
76            cache.remove(lruNode.key);
77
78            currentCapacity--;
79        }
80
81        DoublyNode newNode = new DoublyNode(key, value);
82        insertAtMRU(newNode);
83        cache.put(key, newNode);
84
85        currentCapacity++;
86    }
87}
88
89/**
90 * Your LRUCache object will be instantiated and called as such:
91 * LRUCache obj = new LRUCache(capacity);
92 * int param_1 = obj.get(key);
93 * obj.put(key,value);
94 */