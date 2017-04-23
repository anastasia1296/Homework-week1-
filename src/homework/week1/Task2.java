package homework.week1;

import java.util.Scanner;

/**
 * Created by Anastasya on 08.04.2017.
 */
public class Task2 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input three numbers");
        int n = scan.nextInt();
        int h = scan.nextInt();
        int k = scan.nextInt();
        if ( n>h){
            System.out.println(n);

        }else{
            System.out.println(n+","+k);
        }
    }}


