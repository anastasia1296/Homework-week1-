package homework.week3;

import java.util.*;

/**
 * Created by Anastasya on 03.05.2017.
 */
public class Task9 {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the password twice");
        //int length = scan.nextInt();
        ArrayList<String> password = new ArrayList<String>();
        for (char i = 'A'; i <= 'z'; i++) {
            String letters = new String();
            letters += i;
            if (i == 'Z') i = 'a' - 1;
            password.add(letters);

            Random randomLettersAndNumbers = new Random();
        }
        for (int j = 0; j < 10; j++) {
            String numbers = new String();
            numbers += j;
            password.add(numbers);
        }


        System.out.println(password.toString());
        //   ArrayList<String> newStringPassword= randomLettersAndNumbers.

        //  checkLength(length);
         checkLetters(password);

    }

    public static void checkLength(int size) {
        if ((size < 8) || (size > 20)) {
            System.out.println("The length of the password is wrong. It must be longer than 8 numbers and shorter than 20 numbers");
        }
    }

    public static void checkLetters(ArrayList<String> password) {
        String x ="A;
        password.containsAll(x);
       String str= password;
        for (String x : password) {
            if (Character.isUpperCase(x)) {
                System.out.println("The password is appropriate");

            }


        }

    }}




