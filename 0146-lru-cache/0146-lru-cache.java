class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.val = value;
        this.prev = null;
        this.next = null;
    }
}

class LRUCache {
    private int cap;
    private Map<Integer, Node> cache;
    private Node latest;
    private Node oldest;

    public LRUCache(int capacity) {
        this.cap = capacity;
        this.cache = new HashMap<>();

        // Dummy nodes
        this.latest = new Node(0, 0);
        this.oldest = new Node(0, 0);

        oldest.next = latest;
        latest.prev = oldest;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);

            // Move node to most recently used position
            delete(node);
            insert(node);

            return node.val;
        }

        return -1;
    }

    // Remove a node from the linked list
    public void delete(Node node) {
        Node prev = node.prev;
        Node next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    // Insert node just before latest
    public void insert(Node node) {
        Node prev = latest.prev;
        Node next = latest;

        prev.next = node;
        node.prev = prev;

        node.next = next;
        next.prev = node;
    }

    public void put(int key, int value) {

        // If key already exists, remove old node
        if (cache.containsKey(key)) {
            Node oldNode = cache.get(key);
            delete(oldNode);
            cache.remove(key);
        }

        // Create new node
        Node newNode = new Node(key, value);

        // Add to HashMap
        cache.put(key, newNode);

        // Add to most recently used position
        insert(newNode);

        // If capacity exceeded, remove least recently used
        if (cache.size() > cap) {
            Node lru = oldest.next;

            delete(lru);
            cache.remove(lru.key);
        }
    }
}