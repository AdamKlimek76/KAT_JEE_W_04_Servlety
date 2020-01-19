package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("quit")) {
            String str = scanner.nextLine().replaceAll(" +", "");
            System.out.println(str);
        }

        String equation = "3-1+4*123=1234";
        System.out.println(isEquationCorrect(equation));
        if (isEquationCorrect(equation)) {
            try {
                PrintWriter printWriter = new PrintWriter("Operations.txt");
                printWriter.println(equation);
                printWriter.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Błąd zapisu do pliku.");
            }
        }
    }

    public static boolean isEquationCorrect(String equation) {

        return equation.matches("-?\\d+([\\+\\*/\\-]\\d+)+=\\d+");

    }
}