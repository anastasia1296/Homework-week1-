package homework.week1;

import java.util.Scanner;

/**
 * Created by Anastasya on 08.04.2017.
 */
public class Task6 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int re =scan.nextInt();
        int yu = scan.nextInt();
        int i = re + yu;
        if((i>11)&&(i<19)){
            System.out.println(re+yu);
        }

    }
}
