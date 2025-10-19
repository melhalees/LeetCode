// Last updated: 10/19/2025, 4:58:34 AM
class MyHashMap {

    private final static int BUCKETS_COUNT = 997; // Prime number to minmize collisions
    private Node[] buckets;

    public MyHashMap() {
        buckets = new Node[BUCKETS_COUNT];
    }

    private int hashKey(int key) {
        return key % BUCKETS_COUNT;
    }
    
    public void put(int key, int value) {
        int hash = hashKey(key);

        if (buckets[hash] == null) {
            buckets[hash] = new Node(key, value);
            return;
        }

        Node prev = null; // to track last node
        Node curr = buckets[hash];

        while (curr != null) {
            if (curr.key == key) {
                curr.value = value;
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        prev.next = new Node(key, value);
    }
    
    public int get(int key) {
        int hash = hashKey(key);
        Node curr = buckets[hash];

        while (curr != null) {
            if (curr.key == key) {
                return curr.value;
            }
            curr = curr.next;
        }

        return -1;
    }
    
    public void remove(int key) {
        int hash = hashKey(key);
        Node curr = buckets[hash];
        Node prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    buckets[hash] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    private static class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}


/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */