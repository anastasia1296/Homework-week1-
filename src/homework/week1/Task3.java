package homework.week1;

import java.util.Scanner;

/**
 * Created by Anastasya on 08.04.2017.
 */
public class Task3 {
    public static void main(String []args){
        Scanner scan= new Scanner(System.in);
        int a = scan.nextInt();
        int b = a%7;
        if (b==0){
            System.out.println(a*2);
        }else{
            System.out.println("false");
        }
    }}

