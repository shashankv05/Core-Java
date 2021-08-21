import java.util.Set;

import java.util.TreeSet;

class TreeSetDemo {   // O(log n) Implements Binary Tree

    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(19);
        treeSet.add(21);
        
        System.out.println(treeSet);
        System.out.println(treeSet.contains(19));
        System.out.println(treeSet.size());
        treeSet.remove(21);
        System.out.println(treeSet.size());
    }
    
}
