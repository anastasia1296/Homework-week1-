package homework.week2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Anastasya on 09.04.2017.
 */
public class Task1 {
    public static void main(String []args) {
        int[] arr = {5,56,90,87,66};
        int max = arr[0];
        int imax =0;
        int imin=0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                imax=i;
            }
            if (arr[i] < min) {
                min = arr[i];
                imin=i;
            }
    }
        arr[imin] = max;
        arr[imax] = min;
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+"; ");

    }}

    }
