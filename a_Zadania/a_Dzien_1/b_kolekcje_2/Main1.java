package a_Zadania.a_Dzien_1.b_kolekcje_2;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main1 {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final Set<String>strings = new HashSet<>();
        int count = 0;
        while(!scanner.hasNext("exit")){
            strings.add(scanner.next());
            count++;
            }
        System.out.println("Podanych napisów: " + count + " rozmiar kolekcji" + strings.size());
        System.out.println(strings);

    }

    }

