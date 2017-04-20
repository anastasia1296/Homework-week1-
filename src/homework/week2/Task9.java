package homework.week2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by Anastasya on 17.04.2017.
 */
public class Task9 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        String [] timeTable = Files.lines(Paths.get("C:/Users/Anastasya/Desktop/TimeTable.txt"))
                .toArray(size -> new String[size]);
        System.out.println("Enter the day number of week");

            int numberOfTheDay = scan.nextInt();
            if (numberOfTheDay >= 1 && numberOfTheDay <= timeTable.length) {
                System.out.println(timeTable[numberOfTheDay -1]);
            } else if (numberOfTheDay == 0) {
                System.out.println("Good bye!");
                return;
            } else {
                System.out.println("Wrong input");
            }


        }

    }

