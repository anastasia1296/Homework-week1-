package homework.week3;

import utils.MyUtils;

/**
 * Created by Anastasya on 10.05.2017.
 */
public class Task05 {
    public static void main(String[] args) {
        int array[][]=new int[3][3];
        array[0][1]=10;
        array[1][0]=90;
        array[0][0]=77;
        array[1][1]=80;
        array[0][2]=5;
        array[1][2]=8;
        array[2][2]=23;
        array[2][1]=78;
        array[2][0]=45;
        MyUtils.printMatrix(array);

        sumString(array);


    }

    public static void sumString(int [][]array) {
        int x = array.length;
        int Str1 = 0, Str2 = 0, Str3 = 0;
        for (int i = 0; i < x; i++) {
            Str1 += array[0][i];
        }
        System.out.println("Сумма елементов первой строки равна: " + Str1);
        for (int i = 0; i < x; i++) {
            Str2 += array[1][i];
        }
        System.out.println("Сумма елементов второй строки равна: " + Str2);
        for (int i = 0; i < x; i++) {
            Str3 += array[2][i];
        }
        System.out.println("Сумма елементов третьей строки равна: " + Str3);
        changeRow(Str1,Str2,Str3);
    }
    public static void changeRow(int Str1,int Str2,int Str3 ){
        int array[][]=new int[3][3];
        array[0][1]=10;
        array[1][0]=90;
        array[0][0]=77;
        array[1][1]=80;
        array[0][2]=5;
        array[1][2]=8;
        array[2][2]=23;
        array[2][1]=78;
        array[2][0]=45;
        if(Str1<Str2){
            array[0]=array[1];
        }else if(Str3<Str1){
            Str1=Str3;
        }MyUtils.printMatrix(array);
    }
}




