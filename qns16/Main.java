package qns16;

import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(56);
        s1.add(66);
        s1.add(76);

        Set<Integer> s2 = new HashSet<>();
        s2.add(66);
        s2.add(56);
        s2.add(76);
        System.out.println(s1.containsAll(s2));
        
    }
}
