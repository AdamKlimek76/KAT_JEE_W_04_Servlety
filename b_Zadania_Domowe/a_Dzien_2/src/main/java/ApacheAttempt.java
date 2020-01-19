import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApacheAttempt {

    private static final String EXAMPLE_FILE_PATH =
            "b_Zadania_Domowe/a_Dzien_2/oop.txt";

    public static void main(String[] args) {

        String str1 = "This is a new String.";
        String str2 = "This is another new String, yes!";

        System.out.println("Ends with string (case sensitive): " +
                IOCase.SENSITIVE.checkEndsWith(str1, "string."));
        System.out.println("Ends with string (case insensitive): " +
                IOCase.INSENSITIVE.checkEndsWith(str1, "string."));

        System.out.println("String equality: " +
                IOCase.SENSITIVE.checkEquals(str1, str2));


        File exampleFile = FileUtils.getFile(EXAMPLE_FILE_PATH);
        try {
            LineIterator iter = FileUtils.lineIterator(exampleFile);
            System.out.println("Contents of exampleTxt...");
            while (iter.hasNext()) {
                System.out.println("\t" + iter.next());
            }
            iter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        final String FILE_OOP_PATH = "b_Zadania_Domowe/a_Dzien_2/oop.txt";
        exampleFile = FileUtils.getFile(FILE_OOP_PATH);
        List<String> oopList = new ArrayList<>();
        try {
            LineIterator iter = FileUtils.lineIterator(exampleFile);
            while (iter.hasNext()) {
                String strLine = iter.nextLine();
                oopList.add(strLine);
            }
            iter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String str=oopList.toString();
        System.out.println(str);
        for (int i=0; i<oopList.size(); i++){
            System.out.println(oopList.get(i));
        }


    }

}
