package oop.week1;

import oop.week1.utills1.u01;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Anastasya on 13.05.2017.
 */
public class Lesson1 {
    public static void main(String[] args) throws IOException {
//        Don't touch this code
        String text = FileUtils.readFile("src/resources/WarAndPeace.txt");
//        You can give to getUniqueSortedWords your own String (with delimiters "; ")
        String[] result = u01.getUniqueSortedWords(text);
        System.out.println(Arrays.toString(result));

    } public static String[] getUniqueSortedWords(String text) {
//        TODO find mistake and correct it, so the method works correctly
        String[] words = getWords(text);
        String[] uniqueWords = getUniqueWords(words);
        return sortWords(words);
    }

    public static String[] getWords(String text) {
        if (((text == null) || (text.equals("")))) {
            String[] text1 = new String[0];
            return text1;
        }
        String[] newText = text.split("; ");

        return newText;
    }

    public static String[] getUniqueWords(String[] words) {
        String[] uniqueWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < uniqueWords.length; j++) {
                if (!words[i].equals(uniqueWords[j])) {
                    words[i].equals(uniqueWords[j]);
                }
            }
        }
        return cutString(uniqueWords);
    }

    public static String[] cutString(String[] uniqueWords) {
        for (int i = 0; i < uniqueWords.length; i++) {
            if (uniqueWords[i].equals(" ")) {
                uniqueWords.equals(null);
            }
        }
        return uniqueWords;
    }

    public static String[] sortWords(String[] uniqueWords) {
        Arrays.sort(uniqueWords);
        return uniqueWords;


    }
}

