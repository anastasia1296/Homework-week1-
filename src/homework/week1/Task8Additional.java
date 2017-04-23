package homework.week1;

import java.util.Scanner;

/**
 * Created by Anastasya on 09.04.2017.
 */
public class Task8Additional {
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);
        double purchasePrice= scan.nextDouble();
        double discount = 0.1;
        if(purchasePrice>1000){
           double newPrice= purchasePrice*discount;
           System.out.println(newPrice);
        }else{
            System.out.println("The price of purchase is not hight enought");
        }
    }
}
