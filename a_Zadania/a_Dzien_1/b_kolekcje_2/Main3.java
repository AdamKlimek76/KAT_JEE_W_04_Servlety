package a_Zadania.a_Dzien_1.b_kolekcje_2;

import a_Zadania.a_Dzien_1.a_kolekcje_1.City;

import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        System.out.println(initialize());
        List<Country> countriesList = initialize();
        Map<String, Country> newMap = getMap(countriesList);


        for (Map.Entry<String, Country> entry : newMap.entrySet()) {
            String capital = entry.getKey();
            String country = entry.getValue().getName();
            System.out.println(capital + " - " + country);
        }

        Map<String, List<String>> map = initializeStringMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println(key + " - " + value);
        }

    }


    public static List<Country> initialize() {
        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("Polska", "Warszawa"));
        countryList.add(new Country("Czechy", "Praga"));
        countryList.add(new Country("Niemcy", "Berlin"));
        countryList.add(new Country("Rosja", "Moskwa"));
        countryList.add(new Country("Słowacja", "Bratysława"));

        return countryList;
    }

    public static Map<String, Country> getMap(List<Country> list) {
        Map<String, Country> countries = new HashMap<>();
        Iterator<Country> iterator = list.iterator();
        while (iterator.hasNext()) {
            Country country = iterator.next();
            countries.put(country.getCapital(), country);
        }
        return countries;
    }

    public static Map<Integer, List<String>> initializeMap() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, List<String>> map = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            List<String> list = new ArrayList<>();
            while (!scanner.hasNext("exit")) {
                list.add(scanner.next());
            }
            map.put(i, list);
            scanner.next();
        }

        return map;

    }

    public static Map<String, List<String>> initializeStringMap() {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> map = new HashMap<>();
        List<String>keyList = new ArrayList<>();
        keyList.add("jeden");
        keyList.add("dwa");
        keyList.add("trzy");

        for (int i = 0; i < keyList.size(); i++) {
            List<String> list = new ArrayList<>();
            while (!scanner.hasNext("exit")) {
                list.add(scanner.next());
            }
            map.put(keyList.get(i), list);
            scanner.next();
        }

        return map;

    }

}
