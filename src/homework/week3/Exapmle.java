package homework.week3;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Anastasya on 09.05.2017.
 */
public class Exapmle {
    public static void main(String[] args) throws java.lang.Exception

    {

        final int n = 8;

        char[] chars = new char[n];
//        char[] chars1 = new char[n];
//        char[] chars2 = new char[n];
        for (int i = 0; i < n; i++)
            chars[i] = (char) ('A' + i);
        Random r = new Random();
        for (int i = n - 1; i >= 1; i--) {
            int j = r.nextInt(i + 1);
            char temp = chars[j];
            chars[j] = chars[i];
            chars[i] = temp;

        }
        for (int j = 0; j < n; j++)
            chars[j] = (char) ('0' + j);
        Random f = new Random();
        for (int j = n - 1; j >= 1; j--) {
            int k = f.nextInt(j + 1);
            char temp = chars[k];
            chars[k] = chars[j];
            chars[j] = temp;
        }

        for (int p = 0; p < n; p++)
            chars[p] = (char) ('a' + p);
        Random w = new Random();
        for (int p = n - 1; p >= 1; p--) {
            int y = w.nextInt(p + 1);
            char temp = chars[y];
            chars[y] = chars[p];
            chars[p] = temp;
        }
            //String result1 = new String(chars1);
            String result = new String(chars);
           // String result2 = new String(chars2);
            ArrayList<String> password = new ArrayList<String>();
            password.add(result);
//            password.add(result1);
//            password.add(result2);
            System.out.println(password);
            checkLetters(result);
        }
    public static void checkLetters(String result1) {
        char[] result = result1.toCharArray();
        for (char x : result) {
            if (Character.isLowerCase(x)) {
                System.out.println("The password is appropriate");

            }
        }
    }}