We use a boolean array
A hashset can look up an item in O(1)

To implement a hashset, we need to use array-like memory blocks.

Solution

    We initialise a boolean array. By default new boolean[10] results in all 10 elements given a default value of false
    To add an item to the set, we set its presence to true i.e. bool_array[item] = true;. To remove it, we do bool_array[item] = false;
    items range between 0 and 1000000. Initialising an array of length 1000000 is costly. So we initialise it to a medium range of values, say boolean[] bool_array = new boolean[m];. If the key to be inserted is greater than m, we extend the length of the array on demand using bool_array = Arrays.copy(bool_array,key+n);
    m and n are the deciding factors in performance. low m means the initialization is fast, but chances of the key > m are high. setting n> 1 can reduce collisions, but larger n means more time to increase array size.

class MyHashSet {
    boolean[] arr = new boolean[100];// start with 100 elements for fast initialization
    /** Initialize your data structure here. */
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(key>=arr.length) // if array is too small to accomodate key, extend it.
            extend(key);
        arr[key]=true;
    }
    
    public void remove(int key) {
        if(key>=arr.length) // if array is too small to accomodate key, extend it.
            extend(key);
        arr[key]=false;
    }
    
    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        if(key>=arr.length) // key cannot be in array if array's length < key
            return false;
        return arr[key]==true;
    }
    
    public void extend(int key){
        arr= Arrays.copyOf(arr, key+2);  // extend array to one more item than necessary, we need "key" items. 
									     // we give "key+1" items to reduce collisions.
    }
}
