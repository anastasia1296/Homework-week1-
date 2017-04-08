import java.util.Scanner;

/**
 * Created by Anastasya on 08.04.2017.
 */
public class Task2Additinal {
    public static void main (String [] args){
        Scanner scan  = new Scanner (System.in);
        System.out.println("Enter three numberes");
        double a = scan.nextInt();
        double b = scan.nextInt();
        double c = scan.nextInt();
        if (a>0){
            a = Math.pow(a,3);
            System.out.println(a);
        }else {
            System.out.println("0");
        }
        if (b>0){
            b = Math.pow(b,3);
            System.out.println(b);
        }else{
            System.out.println("0");
        }
        if(c>0){
            c=Math.pow(c,3);
            System.out.println(c);
        }else{
            System.out.println("0");
        }
    }
}

