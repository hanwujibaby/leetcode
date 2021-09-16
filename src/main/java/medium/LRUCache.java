package medium;


import java.time.Instant;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;

/***
 * 运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制 。
 * 实现 LRUCache 类：
 *
 * LRUCache(int capacity) 以正整数作为容量 capacity 初始化 LRU 缓存
 * int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
 * void put(int key, int value) 如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字-值」。当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
 *
 *
 * 输入
 * ["LRUCache", "put", "put", "get", "put", "get", "put", "get", "get", "get"]
 * [[2], [1, 1], [2, 2], [1], [3, 3], [2], [4, 4], [1], [3], [4]]
 * 输出
 * [null, null, null, 1, null, -1, null, -1, 3, 4]
 *
 * 解释
 * LRUCache lRUCache = new LRUCache(2);
 * lRUCache.put(1, 1); // 缓存是 {1=1}
 * lRUCache.put(2, 2); // 缓存是 {1=1, 2=2}
 * lRUCache.get(1);    // 返回 1
 * lRUCache.put(3, 3); // 该操作会使得关键字 2 作废，缓存是 {1=1, 3=3}
 * lRUCache.get(2);    // 返回 -1 (未找到)
 * lRUCache.put(4, 4); // 该操作会使得关键字 1 作废，缓存是 {4=4, 3=3}
 * lRUCache.get(1);    // 返回 -1 (未找到)
 * lRUCache.get(3);    // 返回 3
 * lRUCache.get(4);    // 返回 4
 *
 *
 */
public class LRUCache {

    private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> visitMap = new HashMap<Integer, Integer>();

    private PriorityQueue<Node> prQueue;

    private int capacity;


    public static void main(String[] args) {
        Instant now = Instant.now();
        now.getNano();
        /*
        PriorityQueue<Node> prQueue;
        prQueue = new PriorityQueue<Node>(3, new Comparator<Node>() {
            public int compare(Node n1, Node n2) {
                return n1.visitCount < n2.visitCount ? -1 : 1;
            }
        });
        Node node1 = new Node(30, 1);
        Node node2 = new Node(32, 4);
        Node node3 = new Node(32, 2);
        Node node4 = new Node(32, 5);
        Node node6 = new Node(32, 0);
        prQueue.add(node1);
        prQueue.add(node2);
        prQueue.add(node3);
        prQueue.add(node4);
        prQueue.add(node6);

        prQueue.poll();
        System.out.printf(String.valueOf(prQueue.size()));
        */

        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        System.currentTimeMillis();
        System.out.printf("get(1):" + lruCache.get(1));
        System.out.printf("\n");
        lruCache.put(3, 3);

        System.out.printf("get(2):" + lruCache.get(2));
        System.out.printf("\n");

        lruCache.put(4, 4);
        System.out.printf("get(1):" + lruCache.get(1));
        System.out.printf("\n");
        System.out.printf("get(3):" + lruCache.get(3));
        System.out.printf("\n");
        System.out.printf("get(4):" + lruCache.get(4));
        System.out.printf("\n");
    }


    public LRUCache(int capacity) {
        this.capacity = capacity;
        prQueue = new PriorityQueue<Node>(capacity, new Comparator<Node>() {
            public int compare(Node n1, Node n2) {
                return n1.visitCount < n2.visitCount ? -1 : 1;
            }
        });
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = null;
            int visitTime = Instant.now().getNano();
            if (visitMap.containsKey(key)) {
                visitMap.put(key, visitTime);
                node = new Node(key, visitTime);
            } else {
                visitMap.put(key, visitTime);
                node = new Node(key, 1);
            }

            Iterator<Node> it = prQueue.iterator();
            Node keyNode = null;
            while (it.hasNext()) {
                keyNode = it.next();
                if (keyNode.key == key) {
                    break;
                }
            }

            if (keyNode != null) {
                prQueue.remove(keyNode);
                prQueue.add(node);
            }

            return map.get(key);
        } else {
            return -1;
        }
    }

    public void put(int key, int value) {
        Node node = null;
        int visitTime = Instant.now().getNano();
        if (visitMap.containsKey(key)) {
            node = new Node(key, visitTime);
        } else {
            node = new Node(key, visitTime);
        }

        if (prQueue.size() == capacity) {

            //把访问量少的出队
            Node removeNode = prQueue.poll();
            map.remove(removeNode.key);
            visitMap.remove(removeNode.key);

            prQueue.add(node);
            visitMap.put(node.key, node.visitCount);
            map.put(key, value);
        }

        if (prQueue.size() < capacity) {
            prQueue.add(node);
            visitMap.put(node.key, node.visitCount);
            map.put(key, value);
        }
    }


    /**
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */
    public static class Node {
        private int key;
        private int visitCount;

        Node(int key, int visitCount) {
            this.key = key;
            this.visitCount = visitCount;
        }

    }
}


