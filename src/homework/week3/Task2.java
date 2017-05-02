package homework.week3;

import java.util.Arrays;

/**
 * Created by Anastasya on 27.04.2017.
 */
public class Task2 {
    public static void main(String[] args) {
        String[][] logicMatrix = {{"false", "false", "false"},
                {"true", "false", "don`t know"},
                {"true", "don`t know", "false"},};
        System.out.print(Arrays.deepToString(changeTrue(logicMatrix)));

    }

    public static String[][] changeTrue(String[][] logicMatrix) {
        String count = "";
        for (int i = 0; i < logicMatrix.length; i++)
            for (int j = 0; j < logicMatrix.length; j++) {
                if (logicMatrix[i] == logicMatrix[j]) {
                    count += logicMatrix[i][j];
                    logicMatrix[i][j] = "true";
                }
            }
        return logicMatrix;


    }
}