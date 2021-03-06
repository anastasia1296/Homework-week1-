package homework.week2;

/**
 * Created by Anastasya on 21.04.2017.
 */
public class Task11 {
    public static void main(String[] args) {
        String sentence = new String("Spring day");
        System.out.println(sentence);
        System.out.println(change(sentence));
        System.out.println(arrayReverse(sentence));
    }

    public static String change(String sentence) {
        String[] parts = sentence.split(" ");
        String swapped = "";
        if (parts.length > 1) {
            swapped += parts[parts.length - 1] + ' ';
            for (int i = 1; i < parts.length - 1; i++) {
                swapped += parts[i] + ' ';
            }
        }
        swapped += parts[0];
        return swapped;
    }

    public static char[] arrayReverse(String sentence) {
        char[] array = sentence.toCharArray();
        System.out.print("Reverse: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
        return array;

    }
}

