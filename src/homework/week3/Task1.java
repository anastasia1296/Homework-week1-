package homework.week3;

import utils.MyUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Anastasya on 16.04.2017.
 */
public class Task1 {
    public static void main(String[] args) {
        int[][] numbers = {
                {50, 78, 90},
                {78, 66, 55},
                {45, 23, 13}
        };


        MyUtils.printArray(diagonal(numbers));
        System.out.println(Arrays.deepToString(foundNumber(numbers)));
    }

    public static int[][] foundNumber(int[][] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++)
            for (int j = 0; j < numbers.length; j++) {
                count++;
                if (numbers[i][j] % 5 == 0) {
                    count += numbers[i][j];
                    numbers[i][j] = 8;


                }
            }

        return numbers;

    }

    public static int[] diagonal(int[][] numbers) {
        int[] newMatrix = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    newMatrix[0] = numbers[i][j];
                    newMatrix[1] = numbers[i + 1][j + 1];
                    newMatrix[2] = numbers[i + 2][j + 2];

                }

            }

        return newMatrix;


    }
}


