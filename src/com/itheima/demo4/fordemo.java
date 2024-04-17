package com.itheima.demo4;

import java.util.Scanner;

public class fordemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入起始值");
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入结束值");

        int b = sc1.nextInt();
        for (int i = a;i<=b;i++){
            if (i%3==0 && i%5==0){
                System.out.println(i);
            }
        }
    }
}
