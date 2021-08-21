import java.util.Comparator;

import java.util.PriorityQueue;

// import j ava.util.Queue;

class Priority_Queue {
    public static void main(String[] args) {
        // PriorityQueue <Integer> pq = new PriorityQueue<>(); // Min Heap is Implemented 
        PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  // Max heap is Implemented

        pq.offer(21);
        pq.offer(4);
        pq.offer(5);
        System.out.println(pq);    
        pq.offer(42);
        System.out.println(pq);        
        pq.poll();
        System.out.println(pq.peek());
        System.out.println(pq);
        
    }
}
