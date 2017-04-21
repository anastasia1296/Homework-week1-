package homework.week2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Anastasya on 20.04.2017.
 */
public  class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 0;
        int value2=5;
        System.out.println("Enter length of array");
        int length = scan.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] - 1 + ", ");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i]==value2) {
                i++;
                System.out.println("index = " + i);
            } else if(value2!=array[i]){
                System.out.print("\n" + "-1");

            }}}}




