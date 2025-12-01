// Last updated: 12/1/2025, 3:44:19 PM
1/*
2// Definition for a Node.
3class Node {
4    int val;
5    Node next;
6    Node random;
7
8    public Node(int val) {
9        this.val = val;
10        this.next = null;
11        this.random = null;
12    }
13}
14*/
15
16class Solution {
17    public Node copyRandomList(Node head) {
18        if (head == null) return null;
19
20        Map<Node, Node> map = new HashMap<>();
21
22        Node current = head;
23
24        while (current != null) {
25            map.put(current, new Node(current.val));
26            current = current.next;
27        }
28
29        current = head;
30        while (current != null) {
31            Node copied = map.get(current);
32            copied.next = map.get(current.next);
33            copied.random = map.get(current.random);
34            current = current.next;
35        }
36
37        return map.get(head);
38    }
39}
40