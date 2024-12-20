package com.siddharth;

import org.springframework.web.bind.annotation.RestController;



public class Controller {

    public static void main(String[] args) {
        Controller c = new Controller();
        c.test();
        c.test1();
        c.test2();
        c.test3();
        c.test2();
        System.out.println(12);
    }
    public void test(){
        System.out.println("from test");
    }

    public void test1(){
        System.out.println("from test1");
    }

    public void test2(){
        System.out.println("from test2");
    }

    public void test3(){
        System.out.println("from test2");
    }

}
