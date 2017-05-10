package homework.week3;

/**
 * Created by Anastasya on 27.04.2017.
 */

public class Task4 {
    public static void msin(String[] args) {
        int[] someNumbers = {59, 7, 0, 78};
        int [][] array = {{56},
                {78, 90},
                {100, 8, 0},
                {0, 6, 8, 2},};
        System.out.println(change(someNumbers,array));

    }

    public static int[] change(int[] someNumbers, int[][] array) {
        int[] arrRowSum = new int[array.length];
        int[] colMaxWidth = new int[array.length];
        int start = 0;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++) {
                arrRowSum[i] += array[i][j];
                int digitCount = Integer.toString(array[i][j]).length();
                if (colMaxWidth[j] < digitCount) {
                    colMaxWidth[j] = digitCount;
                }
            }

    int maxRowLen = 1;
        for (int i = 0; i < colMaxWidth.length; i++) {
        maxRowLen += colMaxWidth[i] + 1;
    }

        for (int i = 0; i < array.length; i++) {
        int rowLen = 0;
        for (int j = 0; j < array[i].length; j++) {
            String val = String.format("%1$-" + colMaxWidth[j] + "s ",
                    array[i][j]);
            rowLen += val.length();
            System.out.print(val);
        }
        System.out.format("%1$-" + (maxRowLen - rowLen) + "s | ", "");
       // System.out.println(arrRowSum[i]);
    }return arrRowSum;
    }}
