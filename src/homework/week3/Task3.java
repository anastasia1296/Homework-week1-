package homework.week3;

/**
 * Created by Anastasya on 27.04.2017.
 */
public class Task3 {
    public static void main(String[] args) {
        String someSentense = "а роза упала ";
               String annotherSentense= " алапу азор а";
        System.out.println(chekSentence(someSentense));
        if(annotherSentense.equals(chekSentence(someSentense))){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    public static String chekSentence(String someSentense) {
        String some = "";
        for (int i = someSentense.length() - 1; i >= 0; --i)
            some += someSentense.charAt(i);
        return some;
    }
}