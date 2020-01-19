package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main4 {

    public static void main(String[] args) {

        System.out.println(Main3.initialize());
        List<City> cities = Main3.initialize();
        ListIterator<City> cityListIterator = cities.listIterator();
        while (cityListIterator.hasPrevious()) {
            System.out.println(cityListIterator.previous());
        }
        System.out.println(reverse(cities));
    }

    public static List<City> reverse(List<City> list) {

        List<City> reverseCities = new ArrayList<>();
        final ListIterator<City> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
            reverseCities.add(iterator.previous());
        }

        return reverseCities;
    }
}
