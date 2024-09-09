package com.siddharth;

import org.springframework.web.bind.annotation.RestController;



public class Controller {

    public static void main(String[] args) {
        Controller c = new Controller();
        c.test();
    }
    public void test(){
        System.out.println("from test");
    }

}
