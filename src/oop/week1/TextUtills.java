package oop.week1;

import java.util.Arrays;

/**
 * Created by Anastasya on 13.05.2017.
 */
public class TextUtills {
    /**
     * Method contains inside of its body three another methods.
     * Each of this method defined below.
     *
     * @param text
     * @return sorted by natural order array of unique words
     */
    public static String[] getUniqueSortedWords(String text) {
        String[] words = getWords(text);
        String[] uniqueWords = getUniqueWords(words);
        return sortWords(uniqueWords);
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
//        new array
        String[] uniqueWords = new String[words.length];
        int uniqueCounter = 0;

        for (int i = 0; i < words.length; i++) {
            if (!contains(uniqueWords, words[i])) {
                uniqueWords[uniqueCounter++] = words[i];
            }
        }
        return cutArray(uniqueWords, uniqueCounter);
    }

    private static boolean contains(String[] array, String word) {
//        Todo check if word contains in array
        for (int i = 0; i < array.length; i++) {
            if (word.equals(array[i])) {
                return true;
            }
        }
        return false;
    }

    public static String[] cutArray(String[] array, int counter) {
        String[] copy = new String[counter];

        for (int i = 0; i < counter; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static String[] sortWords(String[] uniqueWords) {
        Arrays.sort(uniqueWords);
        return uniqueWords;


    }
}