package homework.week3;

import utils.MyUtils;

/**
 * Created by Anastasya on 02.05.2017.
 */
//9. Повернуть матрицу(Двухмерный массив). Матрица квадратная. Угол 90 градусов.
public class Task8 {
    public static void main(String[] args) {
        int length = 6;
        int[][] matrix = new int[length][length];
        MyUtils.fillTheMatrix(length,matrix);
        MyUtils.printTheMatrix(length,matrix);
        MyUtils.rotateTheMatrix(length,matrix);

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.print("\n");
        }
    }
}

