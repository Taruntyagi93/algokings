class MyHashMap {

   
    int[] storage;
    /** Initialize your data structure here. */
    public MyHashMap() {
        storage = new int[1000001];
        Arrays.fill(storage, -1);
    }
    
    /** value will always be non-negative. */
    public void put(int key, int value) {
        storage[key] = value;
    }
    
    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return storage[key];
    }
    
    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
        storage[key] = -1;
    }
}
