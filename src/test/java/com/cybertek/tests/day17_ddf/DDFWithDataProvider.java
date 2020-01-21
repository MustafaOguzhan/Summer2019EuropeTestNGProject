package com.cybertek.tests.day17_ddf;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFWithDataProvider {

    @DataProvider
    public Object[][] testData(){
        String [][] data = {
                {"GoT","9"},
                {"HIMYM","9"},
                {"Friends","10"},
                {"Person of Interest","10"},
                {"Breaking Bad","9"},
                {"Big Bang Theory","9"},
                {"Chernobyl","9"},
                {"Prison break","12"}
        };
        return data;
    }

    //get the data from data provider and pass as and argument
    @Test(dataProvider = "testData")
    public void test1(String tvshow, String rating){

        System.out.println("Tv show: "+tvshow+" has rating "+rating);

    }
    @DataProvider
    public Object [][]testData2(){
        String veri[][]={ {"Ali","Bursa", "18"},
                          {"Mehmet","Konya","23"},
                          {"Murat","Eskisehir","34"},
                          {"Hasan","Elazığ","35"},
                          {"Ahmet","Maraş","35"}  }; return veri;

        }
        @Test(dataProvider = "testData2")
        public void test22(String name,String city, String age){

            System.out.println(  name +" is living in "+ city +" and he is "+age+" years old.");


        }




    }





