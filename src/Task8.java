import java.util.Scanner;

/**
 * Created by Anastasya on 08.04.2017.
 */
public class Task8 {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int r = scan.nextInt();
        if((i%10)==(r%10)){
            System.out.println("true");


        }else{
            System.out.println("false");
        }
    }
}
