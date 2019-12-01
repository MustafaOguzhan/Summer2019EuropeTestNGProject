package com.cybertek.utilities;


public class VerifyClass {

    public static void verify(String expected, String actual) {

        if (expected.equalsIgnoreCase(actual)) {
            System.out.println(("PASS"));
        } else {
            System.out.println(("FAIL"));
            System.out.println("expectedResult: " + expected);
            System.out.println("actualResult : " + actual);
        }


    }

}
