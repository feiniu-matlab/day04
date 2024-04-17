package com.itheima.demo4;

import java.util.Scanner;

public class switchdemo {
    public static void main(String[] args) {
        System.out.println("请输入数字");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            case 4 -> System.out.println("退出服务");
            default -> System.out.println("退出服务");
        }
    }
}
