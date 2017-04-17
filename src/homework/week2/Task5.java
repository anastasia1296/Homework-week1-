package homework.week2;

/**
 * Created by Anastasya on 17.04.2017.
 */
public class Task5 {
    public static void main(String []args){
        int value = 129076;
        int [] value2={1,2,9,0,7,6};
        for(int i =0; i<=value2.length-1; i++){
            System.out.print(value2[i] + "; ");
        }
        int max = value2[0];
        for (int i=1; i<value2.length; i++)
        {
            if (value2[i]>max)
            {
                max = value2[i];
            }
        }
        System.out.print("\n"+"max element:" + max);
    }
}


