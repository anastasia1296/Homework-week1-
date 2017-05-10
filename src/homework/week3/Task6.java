package homework.week3;

/**
 * Created by Anastasya on 01.05.2017.
 */
//7. Найти самое длинное слово в строке(разделенное одним пробелом)
public class Task6 {
    public static void main(String []args){
        String str = "My favourite language is";
        String words[] = str.split(" ");
        int i=0;
        int size = words.length;
        int iMax = -1, iMaxLength = -1;
            if (!"".equals(words[i]) && words[i].length() > iMaxLength) {
                iMax = i;
                iMaxLength = words[i].length();
            }
        if (iMax == -1)
            System.err.println("String has no contains words");
        else
            System.out.println( "word = " + words[iMax]);
    }
}

