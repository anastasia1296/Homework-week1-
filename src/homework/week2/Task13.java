package homework.week2;

/**
 * Created by Anastasya on 21.04.2017.
 */
public class Task13 {
    public static void main(String[]args){
        double[]array ={ 1.9,90.999,7.88,5,7,4,90,45,78.0,88.6767};
        double avarage =0;
        if(array.length > 0){
            double sum=0;
            for(int i =0; i<array.length; i++){
                sum+=array[i];
            }
            System.out.println(avarage= sum/array.length);

        }

    }
}
