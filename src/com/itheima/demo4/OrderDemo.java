package com.itheima.demo4;

import java.util.Scanner;

public class OrderDemo {
    public static void main(String[] args) {
        System.out.println("努力做主人喜欢的事");
        System.out.println("大小姐驾到！通通闪开");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入价格：");
        double j = sc.nextInt();
        System.out.println("请输入会员级别：");
        Scanner sc1 = new Scanner(System.in);
        int i = sc1.nextInt();
        double result;
        if (i == 1) {
            result = j * 0.9;
            System.out.println("会员1级：打9折，折后"+ result +"元");
        }
            if (i == 2){
                result = j * 0.8;
                System.out.println("会员2级：打8折，折后"+ result +"元");
            }else if (i == 3){
                    result = j * 0.7;
                    System.out.println("会员3级：打7折，折后"+ result +"元");
            }else {
                System.out.println("打骨折");
            }
    }
}
