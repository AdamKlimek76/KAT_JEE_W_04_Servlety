package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        /*final HashMap<String, Integer> map = new HashMap<>();
        map.put("jeden", 1);
        map.put("dwa", 2);
        map.put("jeden", 3);*/
        Map<String, String> newMap = getMap();

        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (Map.Entry<String, String> entry : newMap.entrySet()) {
            String key = entry.getKey();
            System.out.println(key);
            String answer=scanner.next();
            String value = entry.getValue();
            if (value.equals(answer)){
                count++;
            }
        }
        System.out.println("Podano " + count + " odpowiedzi prawidłowe.");
    }

    public static Map<String, String> getMap() {
        final Map<String, String> map = new HashMap<>();
        map.put("blisko", "daleko");
        map.put("wysoko", "nisko");
        map.put("dużo", "mało");
        map.put("dobrze", "źle");
        map.put("szeroko", "wąsko");

        return map;
    }
}
