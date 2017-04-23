package utils;

/**
 * Created by Anastasya on 22.04.2017.
 */
public class MyUtils {
    public static void printArray(int[] arrayFotPrint) {
        System.out.print(" [");
        for (int i = 0; i < arrayFotPrint.length; i++) {
            System.out.print(arrayFotPrint[i]);
            if (i < arrayFotPrint.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("] ");

    }


    public static int[] randomArray(int []array, int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
                arr[i] = (int) (Math.random() * length);
                System.out.print(arr[i]  + ", ");
        }
        return arr;
    }

    public static int randomValue(int minValue, int maxValue) {
        int result = (int) (Math.random() * (Math.abs(minValue - maxValue) + 1) + minValue);
        return result;
    }

    public static void reWriteMinValue(int[] someArray, int value) {
        int minValue = someArray[0];
        int indexOfMinValue = 0;
        for (int i = 0; i < someArray.length; i++) {
            if (someArray[i] < minValue) {
                minValue = someArray[i];
                indexOfMinValue = i;

            }
        }
        someArray[indexOfMinValue] = value;
    }

    public static int[] findMinMaxValue(int[] arr, int max, int min, int imax, int imin) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                imin = i;
            }
        }
        arr[imin] = max;
        arr[imax] = min;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "; ");

        }
        return arr;
    }

    public static void findEvenNumber(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                n = array[i];
                System.out.println("even number = " + n);
            }

        }
    }
     public static void findMaxElemetOfArray(int [] value2) {
        int max = value2[0];
        for (int i = 1; i < value2.length; i++) {
            if (value2[i] > max) {
                max = value2[i];
            }
        }
        System.out.print("\n" + "max element:" + max);


    }
}



