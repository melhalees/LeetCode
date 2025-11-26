// Last updated: 11/26/2025, 3:14:43 PM
1class BrowserHistory {
2
3    private static class Node {
4        String url;
5        Node prev;
6        Node next;
7
8        Node (String url) {
9            this.url = url;
10        }
11    }
12    
13    private Node current;
14
15    public BrowserHistory(String homepage) {
16        current = new Node(homepage);
17    }
18    
19    public void visit(String url) {
20        Node newNode = new Node(url);
21        current.next = null; // clearing forward history if exist;
22        newNode.prev = current;
23        current.next = newNode;
24        current = newNode;
25    }
26    
27    public String back(int steps) {
28        while (steps > 0 && current.prev != null) {
29            current = current.prev;
30            steps--;
31        }
32
33        return current.url;
34    }
35    
36    public String forward(int steps) {
37        while (steps > 0 && current.next != null) {
38            current = current.next;
39            steps--;
40        }
41
42        return current.url;
43    }
44}
45
46/**
47 * Your BrowserHistory object will be instantiated and called as such:
48 * BrowserHistory obj = new BrowserHistory(homepage);
49 * obj.visit(url);
50 * String param_2 = obj.back(steps);
51 * String param_3 = obj.forward(steps);
52 */