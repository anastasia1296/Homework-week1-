package homework.week1;

import java.util.Scanner;

/**
 * Created by Anastasya on 08.04.2017.
 */
public class Task3Additional {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input speed in meter");
        double meter = scan.nextInt();
        System.out.println("Input speed in kilometer");
        double kilometer = scan.nextInt();
        if (meter >kilometer){
            System.out.println("Speed in meter is bigger");
        }else if(meter<kilometer){
            System.out.println("Speed in kilometer is bigger");
        }
    }
}

