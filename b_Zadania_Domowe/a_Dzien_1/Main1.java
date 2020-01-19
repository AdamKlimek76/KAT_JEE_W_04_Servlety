package b_Zadania_Domowe.a_Dzien_1;

import java.util.*;

public class Main1 {

    public static void main(String[] args) {
        Map<Integer, Integer> randomNumbersMap = checkRand(10, 50000);
        for (Map.Entry<Integer, Integer> entry : randomNumbersMap.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }

        System.out.println("\n" + "Za pomocą iteratora klucz:wartość" + "\n");

        Iterator it = randomNumbersMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry keyValue = (Map.Entry) it.next();
            System.out.println(keyValue.getKey() + " : " + keyValue.getValue());
        }

        System.out.println("Przez rozmiar mapy");
        it = randomNumbersMap.entrySet().iterator();
        for (int i = 0; i < randomNumbersMap.size(); i++) {
            Map.Entry keyValue = (Map.Entry) it.next();
            System.out.println(keyValue.getKey() + " : " + keyValue.getValue());
        }

        System.out.println("Za pomocą iteratora");
        Iterator<Integer> iterator = randomNumbersMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key + " : " + randomNumbersMap.get(key));
        }

    }

    public static Map<Integer, Integer> checkRand(int amount, int interval) {
        Random r = new Random();
        Map<Integer, Integer> numbersMap = new HashMap<>();
        for (int i = 0; i < amount; i++) {
            int nextNumber = r.nextInt(interval);
            numbersMap.put(i, nextNumber);
        }
        return numbersMap;
    }

}
