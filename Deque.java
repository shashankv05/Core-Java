import java.util.ArrayDeque;

import java.util.Deque;

class Deque_Demo {

    public static void main(String[] args) {
        
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(5);
        dq.offerLast(4);
        dq.offer(19);
        System.out.println(dq);


        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println(dq.poll());
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());

        System.out.println(dq);
 
    }
    
}
