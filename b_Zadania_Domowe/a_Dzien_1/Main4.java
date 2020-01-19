package b_Zadania_Domowe.a_Dzien_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.regex.Pattern;

public class Main4 {


    public static void main(String[] args) {

        String filePath = "b_Zadania_Domowe/a_Dzien_1/people.csv";
        //System.out.println(readFile(filePath));
        //System.out.println(createPersonList(filePath));
        Map<Integer, List<Person>> personMapByAge = creatPersonMap(createPersonList(filePath));
        for (Map.Entry<Integer, List<Person>> entry : personMapByAge.entrySet()) {
            Integer key = entry.getKey();
            List<Person> value = entry.getValue();
            System.out.println(key);
            for (int i = 0; i < value.size(); i++) {
                System.out.println(value.get(i));
            }

        }
    }

    static List<String> readFile(String filePath) {
        Path path = Paths.get(filePath);
        List<String> personList = new ArrayList<>();
        try {
            for (String line : Files.readAllLines(path)) {
                String[] personData = line.split(",");
                if (verifyPersonData(personData)) {
                    String personDataStr = Arrays.toString(personData);
                    personList.add(personDataStr);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personList;
    }

    static boolean verifyEmail(String email) {
        return Pattern.matches("[_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z]{2,}", email);
    }

    static boolean verifyFirstName(String firstName) {
        return Pattern.matches("[a-zA-z]+", firstName);
    }

    static boolean verifySecondName(String firstName) {
        return Pattern.matches("[a-zA-z]+", firstName);
    }

    static String ageToString(int age) {
        return Integer.toString(age);
    }

    static boolean verifyAge(String age) {
        return Pattern.matches("[1-9]\\d+", age);
    }

    static boolean verifyCity(String city) {
        return Pattern.matches("[a-zA-Z]+", city);
    }

    static boolean verifyPersonData(String[] personData) {
        return verifyEmail(personData[0]) && verifyFirstName(personData[1])
                && verifySecondName(personData[2]) && verifyAge(personData[3]) && verifyCity(personData[4]);
    }

    static List<Person> createPersonList(String filePath) {
        Path path = Paths.get(filePath);
        List<Person> personList = new ArrayList<>();
        try {
            for (String line : Files.readAllLines(path)) {
                String[] personData = line.split(",");
                if (verifyPersonData(personData)) {
                    String email = personData[0];
                    String firstName = personData[1];
                    String secondName = personData[2];
                    Integer age = Integer.parseInt(personData[3]);
                    String city = personData[4];
                    personList.add(newPerson(email, firstName, secondName, age, city));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personList;
    }

    static Person newPerson(String email, String firstName, String secondName, Integer age, String city) {
        return new Person(email, firstName, secondName, age, city);
    }

    static Map creatPersonMap(List<Person> personList) {
        Map<Integer, List<Person>> peopleByAge = new HashMap<>();
        List<Person> personList1 = new ArrayList<>();
        personList1.add(personList.get(0));
        peopleByAge.put(personList.get(0).getAge(), personList1);
        for (int i = 1; i < personList.size(); i++) {
            Integer ageFromList = personList.get(i).getAge();
            Person personFromList = personList.get(i);
            boolean isKeyAgeExistInMap = false;
            for (Map.Entry<Integer, List<Person>> entry : peopleByAge.entrySet()) {
                Integer key = entry.getKey();
                if (key.equals(ageFromList)) {
                    List<Person> value = entry.getValue();
                    value.add(personFromList);
                    peopleByAge.put(key, value);
                    isKeyAgeExistInMap = true;
                    break;
                }
            }
            if (!isKeyAgeExistInMap) {
                List<Person> personList2 = new ArrayList<>();
                personList2.add(personList.get(i));
                peopleByAge.put(personList.get(i).getAge(), personList2);
            }
        }
        return peopleByAge;
    }

}
