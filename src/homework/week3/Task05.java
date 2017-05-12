package homework.week3;

import utils.MyUtils;

/**
 * Created by Anastasya on 10.05.2017.
 */
public class Task05 {
    public static void main(String[] args) {
        int [][]array={{77,10,5},
                {90,80,8},
                {45,78,23}};

        MyUtils.printMatrix(array);
        sumString(array);


    }

    public static void sumString(int [][]array) {
        int x = array.length;
        int Str1 = 0, Str2 = 0, Str3 = 0;
        for (int i = 0; i < x; i++) {
            Str1 += array[0][i];
            Str2 += array[1][i];
            Str3 += array[2][i];
        System.out.println("Сумма елементов первой строки равна: " + Str1+";\n\"Сумма елементов второй строки равна:"+ Str2+";\n\"Сумма елементов третьей строки равна: " + Str3+";");
        //changeRow(Str1,Str2,Str3);
    }}
    public static void changeRow(int Str1,int Str2,int Str3 ){
        int[][] array={{77,10,5},
                {90,80,8},
                {45,78,23}};
//
        if((Str1<Str2)&&(Str1<Str3)){
            int []buf;
            for (int i = 1; i < array.length; i++) {
                array[0]=array[1];
               // array[1] = buf;
                //array[0]=array[1];
            }

        }MyUtils.printMatrix(array);
    }
}




