package homework.week1;

import java.util.Scanner;

/**
 * Created by Anastasya on 09.04.2017.
 */
public class Task9Additional {
    public static void main(String []args){
        Scanner scan = new Scanner (System.in);
        int numberForMen=100;
        int numberForWomen=110;
        double anotherNumber =1.15;
        String sex1="female";
        String sex2="male";
            System.out.println("Enter your height");
        int height = scan.nextInt();
            System.out.println("Enter your sex");
        String sex = scan.next();
        scan.nextLine();

        if(sex.equalsIgnoreCase(sex1)) {
            double idealWeight1 =  ((height - numberForWomen) * anotherNumber);

            System.out.println(idealWeight1);

        }else if(sex.equalsIgnoreCase(sex2)){
            double idealWeight2=(height-numberForMen)*anotherNumber;

            System.out.println(idealWeight2);
        }
        System.out.println("end");
    }

    }

