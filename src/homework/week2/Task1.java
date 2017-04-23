package homework.week2;

import utils.MyUtils;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Anastasya on 09.04.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {5, 56, 90, 87, 66};
        int max = arr[0];
        int imax = 0;
        int imin = 0;
        int min = arr[0];

        System.out.println(MyUtils.findMinMaxValue(arr, max, min, imax, imin));

    }
}

