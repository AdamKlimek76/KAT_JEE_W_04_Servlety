package b_Zadania_Domowe.a_Dzien_1;

import java.util.regex.Pattern;

public class Main3 {

    public static void main(String[] args) {
        String email="_bcBB123de1-";
        System.out.println(verifyLogin(email));
    }

    static boolean verifyLogin(String email) {
        return verifyNumberLoginCases(email) && verifyLoginCases(email) && verifyLoginFirstCase(email);
    }

    static boolean verifyNumberLoginCases(String email) {
        return Pattern.matches(".{5,}", email);
    }

    static boolean verifyLoginCases(String email) {
        return Pattern.matches("(\\w*\\-*)+", email);
    }

    static boolean verifyLoginFirstCase(String email) {
        return Pattern.matches("\\D.+", email);
    }

}
