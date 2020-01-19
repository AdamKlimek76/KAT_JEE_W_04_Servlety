package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        System.out.println(initialize());
        List<City> cities = initialize();
        System.out.println(firstSubList(cities, 0, 4));
        System.out.println(secondSubList(cities, 0, 4));
    }


    public static List<City> initialize() {
        City city1 = new City("miasto 1", 1000);
        City city2 = new City("miasto 2", 2000);
        City city3 = new City("miasto 3", 3000);
        City city4 = new City("miasto 4", 4000);
        City city5 = new City("miasto 5", 5000);

        List<City> cities = new ArrayList<>();
        cities.add(city1);
        cities.add(city2);
        cities.add(city3);
        cities.add(city4);
        cities.add(city5);

        return cities;
    }

    public static List<City> firstSubList(List<City> list, int start, int end) {

        //Iterator<City> iterator = list.iterator();
        List<City> otherCities = new ArrayList<>();

        for (int i = start; i < end; i++) {
            otherCities.add(list.get(i));
        }
        return otherCities;
    }

    public static List<City> secondSubList(List<City> list, int start, int end) {

        List<City> subCities = list.subList(start, end);

        return subCities;

    }

}
