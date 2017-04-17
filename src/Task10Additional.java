import java.util.Scanner;

/**
 * Created by Anastasya on 09.04.2017.
 */
public class Task10Additional {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        double costOfCall= 20;
        int timeOfCall=scan.nextInt();
        int[] week={1,2,3,4,5,6,7};
            System.out.println("Enter day of the week by using number");
        int sunday=7;
        int saturday =6;

        if(week.length==saturday) {
            double costOfCallNew = timeOfCall * costOfCall * 0.2;
            System.out.println(costOfCallNew);
        }else if(week.length==sunday){
            double costOfCallNew = timeOfCall * costOfCall * 0.2;
            System.out.println(costOfCallNew);
        }else{
            System.out.println(costOfCall*timeOfCall);
        }
        }
    }

