package oop.week1;

import java.io.IOException;
import java.util.Arrays;

/**
 * Created by Anastasya on 13.05.2017.
 */
public class Lesson1 {
    public static void main(String[] args) throws IOException {
//        Don't touch this code
        String text = FileUtils.readFile("src/homework/week3/WarAndPeace.txt");
//        You can give to getUniqueSortedWords your own String (with delimiters "; ")
        String[] result = TextUtills.getUniqueSortedWords(text);
        System.out.println(Arrays.toString(result));
    }}

