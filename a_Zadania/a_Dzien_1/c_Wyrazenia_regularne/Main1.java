package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

public class Main1 {

    public static void main(String[] args) {

        String email="a.klim@op.pl";
        System.out.println(verifyEmail(email));

    }


    static boolean verifyEmail(String email){

        return email.matches("[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,})");

    }

}
