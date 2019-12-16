package com.cybertek.tests.day10_file_upload;

import org.testng.annotations.Test;

public class FilePathExample {

    @Test
    public void test1(){

            System.out.println(System.getProperty("os.name"));
            System.out.println(System.getProperty("user.dir"));
            //path of my project
            String projectPath = System.getProperty("user.d ir");
            String relativePath = "src/test/resouces/testfile.txt";

            String filePath = projectPath+"/"+relativePath;
            System.out.println(filePath);


    }
}
