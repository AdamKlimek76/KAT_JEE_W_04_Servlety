package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {

    public static void main(String[] args) {

        String password = "Pass123";
        System.out.println(verifyLenght(password));
        System.out.println(verifyOneSmallCase(password));
        System.out.println(verifyOneBigCase(password));
        System.out.println(verifyDoubleSmallAndBigCases(password));
        System.out.println(verifyPassword(password));

    }

    static boolean verifyPassword(String password) {

        return verifyLenght(password) && verifyOneSmallCase(password) && verifyOneBigCase(password) && verifyDoubleSmallAndBigCases(password);
    }

    private static boolean verifyLenght(final String password) {
        return password.matches(".{3,10}");
    }

    private static boolean verifyOneSmallCase(final String password) {
        Pattern compiledPattern = Pattern.compile("[a-z]+");
        Matcher matcher = compiledPattern.matcher(password);
        return matcher.find();
    }

    private static boolean verifyOneBigCase(final String password) {
        Pattern compiledPattern = Pattern.compile("[A-Z]+");
        Matcher matcher = compiledPattern.matcher(password);
        return matcher.find();
    }

    private static boolean verifyDoubleSmallAndBigCases(final String password) {
        Pattern compiledPattern = Pattern.compile("[A-Z]{2}|[a-z]{2}");
        Matcher matcher = compiledPattern.matcher(password);
        return !matcher.find();

    }

}
