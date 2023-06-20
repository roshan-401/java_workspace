package qns17;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> codes_A = new HashMap<>();
        codes_A.put(93,"Afganistan");
        codes_A.put(355,"Albania");
        codes_A.put(213, "Algeria");
        System.out.println(codes_A.entrySet());
        Map<Integer,String> codes_B = new HashMap<>();
        codes_B.put(1242,"Bahamas");
        codes_B.put(973,"Bahrain");
        codes_B.put(880,"Bangladesh");
        System.out.println(codes_B.entrySet());

        System.out.println(codes_A.keySet());
        System.out.println(codes_A.values());

        codes_A.putAll(codes_B);
       System.out.println( codes_A.getOrDefault(213, "USA"));

       for(Entry<Integer,String> entry : codes_A.entrySet()){
        if(entry.getValue() == "Bahrain"){
            System.out.println(entry.getKey());
            break;
        }
       }
    }
}
