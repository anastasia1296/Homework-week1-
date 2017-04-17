package homework.week2;

/**
 * Created by Anastasya on 16.04.2017.
 */
public class Task4 {
    public static void main(String [] args){
        int value = 2457836;
        int []array = {2,4,5,7,8,3,6};
        int n =0;
        for(int i =0; i<array.length;i++){
            if(array[i]%2==0){
                n=array[i];
                System.out.println("even number = "+ n);
            }
        }

    }

}


