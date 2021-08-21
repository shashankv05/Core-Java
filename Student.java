import java.util.Objects;

class Student implements Comparable<Student>{

   int rollNo;
   String name;
 // https://www.geeksforgeeks.org/how-to-fix-java-lang-classcastexception-in-treeset/

     Student (int rl, String nm)
      {
                  rollNo=rl;
                  name= nm;   

      }
      public String toString()
      {
            return "Student{" + "Roll: " + rollNo + " " + "Name: " + name + "}";
      }

      @Override
      public int compareTo(Student o) {

            return this.rollNo - o.rollNo;
      }
      
      @Override
      public boolean equals(Object o) {
            // this bole toh Current Object
            if (this == o) return true;
            if (o == null || this.getClass() != o.getClass()) return false;
            Student s =  (Student) o;
            return rollNo == s.rollNo;
            
      }

      @Override
      public int hashCode(){
            return Objects.hash(rollNo);
      }

}