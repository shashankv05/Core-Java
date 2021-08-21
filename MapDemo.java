import java.util.*;

class MapDemo

{
    public static void main(String args[])
    {
        TreeMap <String,Integer> tmap = new TreeMap<String, Integer>();
      
        tmap.put("Kohli",30);
        tmap.put("Raina",24);
        tmap.put("Dhoni",77);
        tmap.put("Verma",42);
    
        System.out.println(tmap);
        System.out.println(tmap.values());
        System.out.println(tmap.keySet());
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter Name:-");
      
        String name =sc.next();
        if(tmap.containsKey(name))
        {
          System.out.println(tmap.get(name));
        }
        else
          System.out.println("Not found");
        sc.close();
           
    }
}        

