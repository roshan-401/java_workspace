package qns15;
import java.util.Set;
import java.util.HashSet;
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(56);
        set1.add(66);
        set1.add(76);
        System.out.println(set1);
        
        Set<Integer> set2 = new HashSet<>();
        set2.add(86);
        set2.add(87);
        set2.add(88);
        System.out.println(set2);
        set1.addAll(set2);
        System.out.println(set1);
        set1.remove(56);
        System.out.println(set1);
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
