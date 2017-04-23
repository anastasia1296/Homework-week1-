package homework.week1;

import java.util.Scanner;

/**
 * Created by Anastasya on 08.04.2017.
 */
public class Task4 {
    public static void main(String[]args){
        Scanner scan =new Scanner (System.in);
        double a = scan.nextDouble();
        if((a>0)&&(a<1)){
            System.out.print("true");
        }else{
            System.out.print("false");
        }



    }
}
