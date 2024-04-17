package com.itheima.demo4;

import java.util.Random;

public class randomdemo {
    public static void main(String[] args) {
        Random ra = new Random();
        int number = ra.nextInt(100);
        System.out.println(number);
    }
}
