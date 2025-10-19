// Last updated: 10/19/2025, 4:58:35 AM
class MyHashSet {

    private final int capacity = 769;
    private LinkedList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int hash(int key) {
        return key % capacity;
    }

    public void add(int key) {
        int idx = hash(key);
        if (!buckets[idx].contains(key)) {
            buckets[idx].add(key);
        }
    }

    public void remove(int key) {
        int idx = hash(key);
        buckets[idx].remove((Integer) key);
    }

    public boolean contains(int key) {
        int idx = hash(key);
        return buckets[idx].contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */