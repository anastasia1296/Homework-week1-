package homework.week3;

import java.util.*;

/**
 * Created by Anastasya on 03.05.2017.
 */
//10. Строки. Ввод пароля.
//        Написать программу ввода пароля пользователя. Пользователь вводит пароль 2 раза. Пароль должен удовлетворять следующим требованиям:
//        - длинна пароля должна быть от 8 до 20 символов
//        - в пароле должны быть как маленькие так и большие буквы
//        - должны быть цифры
//        - не должен содержать слов 'password', 'pass', 'gfhjkm'
//        - генерировать случайный пароль используя символы: a-z A-Z 0-9
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
         chackNumbers(password);
    }

    public static void checkLength(int size) {
        if ((size < 8) || (size > 20)) {
            System.out.println("The length of the password is wrong. It must be longer than 8 numbers and shorter than 20 numbers");
        }
    }

    public static void checkLetters(ArrayList<String> password) {
//        String x ="A,B;
//        password.containsAll(x);
//       String str= password;
//        for (String x : password) {
//            if (Character.isUpperCase(x)) {
//                System.out.println("The password is appropriate");

            }
    public static void chackNumbers(ArrayList<String>password){
        int x= (int) Math.random()*10;
        if(password.contains(x)){

        }System.out.println("Password is appropriate.");
            }


        }






