package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(4);
        set.add(6);
        set.add(9);

        System.out.println(set);

        set.remove(4);
        System.out.println(set);
        System.out.println(set.contains(7));
        System.out.println(set.contains(9));
        set.add(3);
        set.add(8);
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
