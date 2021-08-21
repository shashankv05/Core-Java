import java.util.LinkedHashSet;

import java.util.Set;

class LinkedHashSetDemo {   // LinkedHashSet is ordered and Set on the other hand is unordered

    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(5);
        set.add(4);
        set.add(21);
        set.add(42);
        
        System.out.println(set);
        System.out.println(set.remove(21));
        System.out.println(set);
        System.out.println(set.contains(21));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
    }
    
}
