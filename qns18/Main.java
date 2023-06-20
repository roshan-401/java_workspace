package qns18;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> codes = new HashMap<>();
        codes.put(7,"Kazakhstan");
        codes.put(254,"Kenya");
        codes.put(383,"Kosovo");
        codes.put(965,"Kuwait");
        System.out.println("Hashmap "+codes);
        Map<Integer,String> codesTree = new TreeMap<>();
        codesTree.putAll(codes);
        System.out.println("Treemap "+codesTree);
    }

}
