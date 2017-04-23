package homework.week2;

/**
 * Created by Anastasya on 21.04.2017.
 */
public class Task14 {
    public static void main(String[] args) {
        int[] arr1 = {7, 9, 90, 8};
        for (int j = 0; j < arr1.length; j++) {
            System.out.print(arr1[j] + "; ");
        }
        int[] arr2 = {'n', 'j', 'l', 'i'};
        System.arraycopy(arr1, 0, arr2, 0, arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("\n" + arr2[i]);
        }
    }
}
