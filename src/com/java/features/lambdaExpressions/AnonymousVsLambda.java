package com.java.features.lambdaExpressions;

import java.io.File;
import java.io.FileFilter;

public class AnonymousVsLambda {
    public static void main(String[] args) {

        // This is the Anonymous class

//        FileFilter filter = new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.getName().endsWith(".java");
//            }
//        };

        // This is the Lambda Expression equivalent of the above Anonymous class

        FileFilter filterLambda = (pathname) -> pathname.getName().endsWith(".java");


        File dir = new File("d:/temp");

      //  File[] files = dir.listFiles(filter);

          File[] files = dir.listFiles(filterLambda);


        assert files != null;
        for (File f : files) {
            System.out.println(f);
        }

    }
}
