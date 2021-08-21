import java.util.Stack;

// Student class is accessible by default 
class StackDemo {

    public static void main(String[] args) {
    
        
    Stack <Student> s = new Stack<>();
    s.push(new Student(5, "Shashank"));
    s.push(new Student(4, "Ishaan"));
    s.push(new Student(21, "Simranjeet"));
    s.push(new Student(42, "Ranveer"));
    System.out.println(s.peek());
    
    s.pop();

    System.out.println(s);
    }    

}
