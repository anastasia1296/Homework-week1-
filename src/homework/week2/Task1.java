package homework.week2;

import java.util.Scanner;

/**
 * Created by Anastasya on 09.04.2017.
 */
public class Task1 {
    public static void main(String []args) {
        int[] arr = {5, 56, 90, 87, 66};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max + ";" + min);
    }}

