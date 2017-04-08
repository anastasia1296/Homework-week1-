import java.util.Scanner;

/**
 * Created by Anastasya on 08.04.2017.
 */
public class Task1 {
    public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Tell the time");
        int n =scan.nextInt();
        int f = scan.nextInt();
        if (n>=9||f<=18){
            System.out.println("I am in the office");

        }else{
            System.out.println("I am at home ");
        }
    }
}
