package homework.week1;

import java.util.Scanner;

/**
 * Created by Anastasya on 08.04.2017.
 */
public class Task7 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int r = scan.nextInt();
        int y = i/r;
        int o = i%r;
        if (o==0){
            System.out.print("true"+";"+y);


        }else{
            System.out.println("false"+";"+y+";"+o);
        }
    }
}
