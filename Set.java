import java.util.HashSet;

import java.util.Set;

class Set_Demo {            // Set is unordered

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5); 
        set.add(4);
        set.add(21);

        set.add(21);   // Set contains unique element so it will not add 21 again

        System.out.println(set);
        System.out.println(set.remove(100));
        System.out.println(set);
        System.out.println(set.contains(21));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
    
}
