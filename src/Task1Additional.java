import java.util.Scanner;

/**
 * Created by Anastasya on 08.04.2017.
 */
public class Task1Additional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three sides of triangle");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if ((c > a && c > b)) {
            System.out.println(" right triangle ");
        } else {
            System.out.println(" Other tringle");
        }
    }
}