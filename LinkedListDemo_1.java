import java.util.*;

class Vegetable
{
   int price;
   String name;
  
   Vegetable(int p, String nm)
    {
           price=p;
           name=nm;
      }
     public String toString()
     {
               return price+"\t"+name; 
     } 
}

class Fruit
{
   int price;
   String name;
  
  Fruit(int p, String nm)
    {
           price=p;
           name=nm;
      }
     public String toString()
     {
               return price+"\t"+name; 
     } 
}
 
class LinkedListDemo2
{
       public static void main (String args[])
     {
            
              Vegetable s1 = new Vegetable(10,"Potato");             
              Vegetable s2 = new Vegetable (20,"Onion");
              Vegetable s3 =new Vegetable (40,"Carrot");
                                    
          LinkedList<Fruit> list1 = new LinkedList<Fruit>();
          LinkedList<Vegetable> list2 = new LinkedList<Vegetable>();
          list2.add(s1);
          list2.add(s2);
          list2.add(s3);
      
         
           Fruit f1 =new Fruit(50,"Apple");
           Fruit f2 =new Fruit(60,"Mango");
           Fruit f3 =new Fruit(70,"Strawberry");
         
          
	    list1.add(f1);
           list1.add(f2);
           list1.add(f3);
  
           for(Object s:list1)
          {
                 System.out.println(s.toString());
          }        

           for(Object s:list2)
           {
                  System.out.println(s.toString());
           }  
           
      }       
}



