import java.util.Set;

import java.util.TreeSet;
class TreeSetDemo_1 {

    public static void main(String[] args) {
        
        Set<Student> s = new TreeSet<>();
        s.add(new Student(5, "Shashank"));
        s.add(new Student(4, "Ishaan"));
        s.add(new Student(21, "Ranveer"));
        s.add(new Student(21, "Ranveer"));

        Student s1 = new Student(10, "Messi");
        Student s3 = new Student(19, "Rahul");
        System.out.println(s1.equals(s3));       // Equals method is Overriden in Student class


        System.out.println(s);


    }


}
