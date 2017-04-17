package homework.week2;

import java.util.Scanner;

/**
 * Created by Anastasya on 17.04.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three values of array");
        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int[] array = {n, k, l};
        int j1 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                j1 = array[i];
                System.out.println(j1);
            }
        }
        if ((n % 2 != 0) && (k % 2 != 0)) {
            System.out.println(n + k);
        }
        if ((k % 2 != 0) && (l % 2 != 0)) {
            System.out.println(k + l);
        }
        if ((n % 2 != 0) && (l % 2 != 0)) {
            System.out.println(n + l);
        }
        if ((k % 2 != 0) && (l % 2 != 0) && (n % 2 != 0)) {
            System.out.println(k + l + n);
        }
    }
}
