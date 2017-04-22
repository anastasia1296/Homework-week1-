package homework.week2;

/**
 * Created by Anastasya on 21.04.2017.
 */
public class Task15 {
    public static void main(String[]args){
        String someSentence=new String("An apple a day keepes a doctor away");
        String[]line =someSentence.split("");
        String countA ="a";
        int count =0;
        for(int i =0; 0<line.length; i++){
            if(countA.equals(line[i])) {
                count = ++count + 0;
            }
            }
            System.out.print(countA+" "+count);
        }
    }

