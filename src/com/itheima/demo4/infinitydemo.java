package com.itheima.demo4;

import java.util.Scanner;

public class infinitydemo {
    public static void main(String[] args) {
        int temp;
        System.out.println("请输入：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 2;i <= a-1;i++){
            if(a % i == 0){
                System.out.println("不是一个质数");
                break;
            }
        }

    }
}
