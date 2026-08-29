class Node{
    public int key, val;
    public Node next, prev;
    Node(){
        prev = next = null;
        key = val = -1;
    }
    Node(int k, int value){
        key = k;
        val = value;
        next = prev = null;
    }
}
class LRUCache {
private Map<Integer, Node> map;
    private int cap;
    private Node head;
    private Node tail;

    public LRUCache(int capacity) {
        cap = capacity;
        map = new HashMap<>();

        head = new Node();
        tail = new Node();

        head.next = tail;
        tail.prev = head;
       
    }

    public int get(int key_) {
        if(!map.containsKey(key_)){
            return -1;
        }
        Node node = map.get(key_);
        int val = node.val;
        deleteNode(node);
        insertAfterHead(node);
        return val;
    }
    private void deleteNode(Node node){
        Node nextNode = node.next;
        Node prevNode = node.prev;
        nextNode.prev = prevNode;
        prevNode.next = nextNode;

    }private void insertAfterHead(Node node){
        Node nextNode = head.next;
        head.next = node;
        nextNode.prev = node;
        node.next = nextNode;
        node.prev = head;
    }

    public void put(int key_, int value) {

        if(map.containsKey(key_)){
            Node node = map.get(key_);
            node.val = value;
            deleteNode(node);
            insertAfterHead(node);
            return;
        }
        if(map.size() == cap){
            Node node = tail.prev;
            map.remove(node.key);
            deleteNode(node);
        }
        Node newNode = new Node(key_, value);
        map.put(key_, newNode);
        insertAfterHead(newNode);
    }

}