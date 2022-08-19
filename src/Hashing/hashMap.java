package Hashing;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    //Country Population
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 120);
        hm.put("China", 220);
        hm.put("Australia", 200);
        hm.put("Dubai", 100);

        System.out.println(hm);

        int china = hm.get("China");
        System.out.println(china);

        if (hm.containsKey("Australia")){
            System.out.println("Contain in the map");
        }
        else {
            System.out.println("Does not  contain");
        }

        for(Map.Entry<String, Integer> e : hm.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
