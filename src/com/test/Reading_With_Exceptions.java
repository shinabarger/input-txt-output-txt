package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by davidshinabarger on 8/29/17.
 */

public class Reading_With_Exceptions {

    public static void process(String inputFileName) {

        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(inputFileName);
            bufferedReader = new BufferedReader(fileReader);

            String currentLine;

            while((currentLine = bufferedReader.readLine()) != null) {
                System.out.println(currentLine);
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
