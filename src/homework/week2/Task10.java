package homework.week2;

import utils.MyUtils;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Anastasya on 20.04.2017.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value2 = 5;
        System.out.println("Enter length of array");
        int length = scan.nextInt();
        int[] array = new int[length];
        System.out.print(MyUtils.randomArray(array, length));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value2) {
                i++;
                System.out.println("\n"+"index = " + i);
            } else if (value2 != array[i]) {
                System.out.print("\n" + "-1");

            }
        }
    }
}




