package com.itheima.demo4;

public class methoddemo {
    public static void main(String[] args) {
        out();
        sum(10,60);
    }

    public static void out() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);
    }

    public static void sum(int c,int d) {
        int sum1 = 2*c + 2*d;
        System.out.println(sum1);
    }
}

