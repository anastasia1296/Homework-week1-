package homework.week2;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by Anastasya on 21.04.2017.
 */
public class Task12 {
    public static void main(String []args){
        String text = new String ("Do you like traveling ?");
        String[] words= text.split(Pattern.quote(""));
        System.out.println(Arrays.toString(words));
           System.out.print(words[7]);

       }

    }
