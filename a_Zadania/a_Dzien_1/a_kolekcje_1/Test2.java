package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        for (i = 1; i < 5; i++) {

            while(!scanner.hasNext("exit")) {
                scanner.next();
            }
            scanner.next();
            System.out.println(i);
        }
    }
}
