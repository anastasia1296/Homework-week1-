package homework.week3;

/**
 * Created by Anastasya on 02.05.2017.
 */
public class Task8 {
    public static void main(String[] args) {
        int m = 6;
        int[][] A = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                A[i][j] = m * i + j;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("\nrotated\n\n");
        for (int k = 0; k < m / 2; k++) // border -> center
        {
            for (int j = k; j < m - 1 - k; j++) // left -> right
            {
                int tmp = A[k][j];
                A[k][j] = A[j][m - 1 - k];
                A[j][m - 1 - k] = A[m - 1 - k][m - 1 - j];
                A[m - 1 - k][m - 1 - j] = A[m - 1 - j][k];
                A[m - 1 - j][k] = tmp;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d ", A[i][j]);
            }
            System.out.print("\n");
        }
    }
}

