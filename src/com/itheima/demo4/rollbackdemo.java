package com.itheima.demo4;

import java.util.Scanner;

public class rollbackdemo {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("请输入数字：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int temp = i;
        while (i != 0){
            int a = i%10;
            i = i/10;
            sum = sum*10+a;
        }
        if(sum == temp){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
