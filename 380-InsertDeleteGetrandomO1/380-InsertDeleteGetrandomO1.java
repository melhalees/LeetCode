// Last updated: 10/19/2025, 4:58:42 AM
import java.util.*;

class RandomizedSet {
    private final Map<Integer, Integer> itemsIndex;
    private final List<Integer> items;
    private final Random random;


    public RandomizedSet() {
        itemsIndex = new HashMap<>();
        items = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if (itemsIndex.containsKey(val)) return false;

        items.add(val);
        itemsIndex.put(val, items.size() - 1);
        
        return true;
    }
    
    public boolean remove(int val) {
        if (! itemsIndex.containsKey(val)) return false;

        int valIndex = itemsIndex.get(val);
        int lastItem = items.get(items.size() - 1);

        items.set(valIndex, lastItem);
        itemsIndex.put(lastItem, valIndex);

        items.remove(items.size() - 1);
        itemsIndex.remove(val);

        return true;
    }
    
    public int getRandom() {
        int randomIndex = random.nextInt(items.size());
        return items.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */