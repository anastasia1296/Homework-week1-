package homework.week2;

import java.util.Scanner;

/**
 * Created by Anastasya on 16.04.2017.
 */
public class Task3 {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a = scan.nextInt();
        int b =scan.nextInt();
        int [] value = {a,b};
        System.out.print(a*b);

    }
}
