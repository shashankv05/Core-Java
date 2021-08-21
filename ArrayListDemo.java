import java.util.*;

class ArrayListDemo
{
          public static void main(String args[]) {
           Student s1 = new Student(1,"Ranveer");
           Student s3 = new Student(3,"Ishaan");
           Student s4 = new Student(4,"Arjun");
 
            ArrayList<Student> arrlist = new ArrayList<Student>();
 
                      arrlist.add(s1);    
                      arrlist.add(s3);
                      arrlist.add(s4);
                      arrlist.add(new Student(5,"Shashank"));

            ArrayList<Student> newList = new ArrayList<>();
            newList.add(new Student(21, "Kulwinder"));
            newList.add(new Student(42, "Simranjeet"));

            arrlist.addAll(newList);

            System.out.println(arrlist);
            // System.out.println(arrlist.get(5));

            // System.out.println(arrlist.remove(1));    # Using Index
            // arrlist.remove(s3);                        # Using type

            arrlist.set(1, new Student(3, "Ishaan Sikka"));
            
            System.out.println(arrlist);
            
            // arrlist.clear();          // Returns an Empty list
            
            // for(Object s:arrlist)
            // {
            //       System.out.println(s.toString());
            // }

            System.out.println("Using For Each:");
            for (Student student : arrlist) {
                  System.out.println(student);
            }

            System.out.println("Using Iterator:");
            Iterator<Student> itr = arrlist.iterator();
            while (itr.hasNext()){
                  System.out.println(itr.next());
            }
      }


}


