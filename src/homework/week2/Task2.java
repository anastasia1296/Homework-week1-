package homework.week2;

import java.util.Arrays;

/**
 * Created by Anastasya on 16.04.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[88];
        for (int i = 35; i <= 87; i++) {
            array[i] = i;
            //System.out.print(array[i] + "; ");
            if ((array[i] % 7 == 1) || (array[i] % 7 == 2) || (array[i] % 7 == 5)) {
                System.out.print(array[i] + "; ");
            }

        }
    }
}