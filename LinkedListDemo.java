import java.util.*;



class LinkedListDemo
{
          public static void main(String args[])
     {
           Student s1 = new Student(42,"Ranveer");
           Student s5 = new Student(9,"Dhairya");
           Student s4 = new Student(5,"Shashank");

      LinkedList<Student> list =new LinkedList<Student>();
           list.addLast(s1);
           list.addLast(s4);
           list.addFirst(s5);
           list.add(new Student(1,"Ishaani"));
            
         for (Object s:list)
           {
                 System.out.println(s.toString());
 
           }
   
      }
}






