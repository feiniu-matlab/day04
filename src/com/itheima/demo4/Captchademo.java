package com.itheima.demo4;
/* 定义方法实现随机产生一个5位验证码
验证码格式：
长度为5
前四位是大写字母或者小写字母
最后一位是数字
 */

/* 方法：
在以后如果我们要在一堆没有什么规律的数据中随机抽取
可以先把这些数据方法放到数组当中
在随机抽取一个索引
 */
public class Captchademo {
    public static void main(String[] args) {
        char[] chs = new char[52];
        // 将大写字母放到数组chs里面
        for (int i = 0; i < 26; i++) {
            chs[i] = (char) (65+i); //强行转换数据类型
            chs[i+26] = (char) (97+i);
        }

        for (int i = 0; i < 52; i++) {
            System.out.print(chs[i]);
            System.out.println("hello world!");
            System.out.println("hello china!");
            System.out.println("hello guangxi!");
            System.out.println("push git");
            System.out.println("push by SSH");
            System.out.println("pull from github");
        }
    }
}
