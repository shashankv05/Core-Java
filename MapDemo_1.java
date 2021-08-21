import java.util.HashMap;
import java.util.Map;

class MapDemo_1 {
    public static void main(String[] args) {
        
        Map<String, Integer> m = new HashMap<>();
            // The HashMap does not sort the Keys whereas TreeMap does Binary Search and Sorts

        m.put("Shashank", 5);
        m.put("Ishaan", 4);
        m.put("Ranveer", 21);

        // System.out.println(m.keySet());
        // System.out.println(m.values());

        // m.putIfAbsent("Ishaan", 19);
        // System.out.println(m);
        // System.out.println(m.containsValue(4));
        // System.out.println(m);
        // System.out.println(m.isEmpty());
        
    }

}
