package com.test;

import java.io.File;

/**
 * Created by davidshinabarger on 8/29/17.
 */

public class Reading_With_Exceptions {

    public static void process(String inputFileName) {

        File inputFile = new File(inputFileName);
        System.out.println(inputFileName);

    }

    public static String returnsString(String inputFileName) {
        return inputFileName;

    }
}
