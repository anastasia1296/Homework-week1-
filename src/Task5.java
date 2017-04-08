import java.util.Scanner;

/**
 * Created by Anastasya on 08.04.2017.
 */
public class Task5 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int r = scan.nextInt();
        if(i>r){
            System.out.println(i-r);
        }else{
            System.out.println(i+r);
        }

    }
}
