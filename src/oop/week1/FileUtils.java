package oop.week1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Anastasya on 13.05.2017.
 */
public class FileUtils {
        public static String readFile(String path) throws IOException {
            BufferedReader br = new BufferedReader(new FileReader(new File("src/resources/WarAndPeace.txt")));
            StringBuilder sb = new StringBuilder();
            while (br.ready()){
                sb.append(br.readLine()).append("\n");
            }
            return sb.toString().substring(1);
        }
    }

