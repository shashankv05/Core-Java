import java.util.ArrayList;

import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

class CollectionsDemo {
    
    public static void main(String[] args) {
        // List<Integer> l = new ArrayList<>();
        // l.add(5);
        // l.add(4);
        // l.add(21);
        // l.add(42);
        // l.add(5);
        // l.add(5);        
        // System.out.println("Minimum Elemnt: " + Collections.min(l));
        // System.out.println("Max Element: " + Collections.max(l));
        // System.out.println(Collections.frequency(l, 5));
        // Collections.sort(l, Comparator.reverseOrder());


        // System.out.println(l);
        List<Student> l = new ArrayList<>();
        l.add(new Student(5, "Shashank"));
        l.add(new Student(4, "Ishaan"));
        l.add(new Student(21, "Ranveer"));
        Collections.sort(l);   // Sorted by Roll 

        // We want to Sort by Name
        // Collections.sort(l, new Comparator<Student>(){
        //     @Override
        //     public int compare(Student o1, Student o2){
        //         return o1.name.compareTo(o2.name);
        //     }            
        // });

        // Using Lambda
        Collections.sort(l, (o1, o2) -> o1.name.compareTo(o2.name));

        System.out.println(l);


        
    }

}
