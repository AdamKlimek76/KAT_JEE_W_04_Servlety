import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestyRandom {

    public static void main(String[] args) {
        Random r = new Random();
        int[] randomNumbers = new int[10];
        for (int i = 0; i < 10; i++) {
            randomNumbers[i] = r.nextInt(100) + 1;
        }
        System.out.println("Lista niesortowana:");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }
        System.out.println("Lista sortowana");
        Arrays.sort(randomNumbers);
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.println(randomNumbers[i]);
        }
    }
}
