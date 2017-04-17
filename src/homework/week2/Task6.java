package homework.week2;

/**
 * Created by Anastasya on 17.04.2017.
 */
public class Task6 {
    public static void main(String []args){
        int []value ={100, 90,78,3330};
        int max = value[0];
        for(int i=0; i<value.length;i++){
            if(max<value[i]){
                max=value[i];
            }
        }
        System.out.println("Max element:"+ max);
    }
}
