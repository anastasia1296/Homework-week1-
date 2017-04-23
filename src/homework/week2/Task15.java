package homework.week2;

/**
 * Created by Anastasya on 21.04.2017.
 */
public class Task15 {
    public static void main (String[] args) {
        String someSentence = new String("An apple a day keepes a doctor away");
        String[] line = someSentence.split("");
        String countA = "a";
        int count = 0;
        for (int i = 0; i < line.length; i++) {
            if (countA.equalsIgnoreCase(line[i])) {
                count++;
            }
        }
        System.out.print(countA + "= "+ count);
    }

}

