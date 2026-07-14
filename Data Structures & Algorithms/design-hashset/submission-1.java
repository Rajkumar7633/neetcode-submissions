class MyHashSet {

    // ArrayList<Integer> list;
    private boolean[] set;

    public MyHashSet() {
        // list = new ArrayList<>();
        set = new boolean[1000001];
    }
    
    public void add(int key) {
        // if(!list.contains(key)){
        //     list.add(key);
        // }

        set[key] = true;
    }
    
    public void remove(int key) {
        // list.remove(Integer.valueOf(key));
        set[key] = false;
    }
    
    public boolean contains(int key) {
        // return list.contains(key);
        return set[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */