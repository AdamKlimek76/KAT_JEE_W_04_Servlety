package a_Zadania.a_Dzien_1.a_kolekcje_1;

public class Test {

    public static void main(String[] args) {
        String str = "";
        String str2 = "";
        for (int i = 1; i < 5; i++) {
            str2="";
            for (int j = 1; j < 10; j++) {
                int result = i * j;
                str = Integer.toString(result);
                str2 = str2 + " " + str;
                //System.out.println(str2);
            }
            System.out.println(str2);
        }
    }
}
