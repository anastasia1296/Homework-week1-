package homework.week2;

import java.util.Scanner;

/**
 * Created by Anastasya on 17.04.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three values of array");
        int unevenNumber1 = scan.nextInt();
        int ubevenNumber2 = scan.nextInt();
        int unevenNumber3 = scan.nextInt();
        int[] array = {unevenNumber1, ubevenNumber2, unevenNumber3};
        int j = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                j = array[i];
                System.out.print(j+"; ");
            }
        }
        if ((unevenNumber1 % 2 != 0) && (ubevenNumber2 % 2 != 0)) {
            System.out.println(unevenNumber1 + ubevenNumber2);
        }
        if ((ubevenNumber2 % 2 != 0) && (unevenNumber3 % 2 != 0)) {
            System.out.println(ubevenNumber2 + unevenNumber3);
        }
        if ((unevenNumber1 % 2 != 0) && (unevenNumber3 % 2 != 0)) {
            System.out.println(unevenNumber1 + unevenNumber3);
        }
        if ((unevenNumber1 % 2 != 0) && (ubevenNumber2 % 2 != 0) && (unevenNumber3 % 2 != 0)) {
            System.out.println(unevenNumber1 + ubevenNumber2 + unevenNumber3);
        }
    }
}
