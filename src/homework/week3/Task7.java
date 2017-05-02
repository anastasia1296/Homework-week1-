package homework.week3;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Anastasya on 01.05.2017.
 */
public class Task7 {
    public static void main(String[] args) {
        String text = "This is summer summer weather";
        Set<String> set = new LinkedHashSet<String>();
        String[] stringArray = text.split(" ");
        set.addAll(Arrays.asList(stringArray));
        String[] outputArray = new String[set.size()];
        set.toArray(outputArray);
        System.out.println("outputArray" + Arrays.toString(outputArray));
    }
}