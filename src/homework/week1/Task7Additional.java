package homework.week1;

import java.util.Scanner;

/**
 * Created by Anastasya on 09.04.2017.
 */
public class Task7Additional {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        String [] month={"january","february","march","april","may","june","july","august","september","october",
                "november", "december"};
        System.out.println("Enter number of the month");
        int number = scan.nextInt();
            if(number>=1 && number<=month.length){
                System.out.println("month-"+ month[number -1]);
        }else {
                System.out.println("Error");
            }

    }
}
