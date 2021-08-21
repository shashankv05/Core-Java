import java.util.LinkedList;
import java.util.Queue;

class Queue_Demo {

    public static void main(String[] args) {
        
        Queue<Student> q = new LinkedList<>();   //As the Queue is an interface, it cannot be instantiated.
        q.offer(new Student(21, "Simranjeet"));
        q.offer(new Student(4, "Ishaan"));
        q.offer(new Student(5, "Shashank"));
        System.out.println(q);
        System.out.println(q.poll());          // Retrieves and Removes the head of the Queue
        System.out.println(q.peek());
        System.out.println(q);
      

    }
}