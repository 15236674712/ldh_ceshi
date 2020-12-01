package com.baizhi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitTests {

    @Test
    void contextLoads() {
        System.out.println("====");

        int a = 2147483646;
        a = a + 3;
        System.out.println(a);
        //-2147483647
        int aaa = 12;

        int dev = 12;
        int bbb = 11;
        
        String str="lalala";         
        String str1="lalala";
        String str2="lalala";
        String str3 = "lalala";



    }

    public static void main(String[] args) {
        System.out.println("===");
        int a = 10;
        int b = 20;
    }

}
