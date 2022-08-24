package Hashing;

import java.util.HashMap;
import java.util.Scanner;

public class MaxFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (hm.containsKey(ch)){
                int oldFreq = hm.get(ch);
                int newFreq = oldFreq + 1;
                hm.put(ch, newFreq);
            }
            else {
                hm.put(ch, 1);
            }
        }

        char max = str.charAt(0);
        for (Character key: hm.keySet()){
            if (hm.get(key) > hm.get(max)){
                max = key;
            }
        }
    }
}
