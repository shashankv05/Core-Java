class Person{
    int age;
    String name;
    static int count = 0;
    public Person(){
        count++;
    }

    public Person(String name, int age){
        this.age = age;
        this.name = name;
        count++;
    }
    

    void ShowDetails(){
        System.out.println(this.getClass() + "'s Instance: " + name + " " + age);
    }
}

class Employee extends Person{

    Employee (String name, int age){
        super(name, age);
    }
}


class Run {

    public static void main(String[] args) {
            
        Person p1 = new Person("Shashank", 24); 
        Person p4 = new Person();
        p4.age = 24;
        p4.name = "Ranveer";          
        p1.ShowDetails();
        p4.ShowDetails();

       Employee e1 = new Employee("Arjun", 21);
       e1.ShowDetails();

       System.out.println("Total Count: " + String.valueOf(Person.count));
     
        
    }
}