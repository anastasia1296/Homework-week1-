package homework.week2;

/**
 * Created by Anastasya on 17.04.2017.
 */
public class Task7 {
    public static void main(String []args){
        int []array= {46,-79,890,-9000};
        int min = array[0];

        for(int i =0; i<array.length;i++){
            if(min<Math.abs(array[i])){
                min=Math.abs(array[i]);
            }
        }
        System.out.println(min);
    }
}

