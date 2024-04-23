package com.itheima.demo4;
/* 定义方法实现随机产生一个5位验证码
验证码格式：
长度为5
前四位是大写字母或者小写字母
最后一位是数字
 */

import java.util.Random;

/* 方法：
在以后如果我们要在一堆没有什么规律的数据中随机抽取
可以先把这些数据方法放到数组当中
在随机抽取一个索引
 */
public class Captchademo {
    public static void main(String[] args) {
        char[] chs = new char[52];
        char[] cap = new char[5];
        char[] nums = {'0','1','2','3','4','5','6','7','8','9'};
        Random r = new Random();
        // 将大写字母放到数组chs里面
        for (int i = 0; i < 26; i++) {
            chs[i] = (char) (65+i); //强行转换数据类型
            chs[i+26] = (char) (97+i);
        }
        // 随机生成前四位
        for (int i1 = 0; i1 <= 4; i1++) {
            int num1 = r.nextInt(52);
            if(i1 == 4){
                int num2 = r.nextInt(10);
                cap[i1] = nums[num2];
            }else {
                cap[i1] = chs[num1];
            }

        }
        /*for (int i = 0; i < 52; i++) {
            System.out.print(chs[i]);
        }*/
        System.out.print("验证码为：");
        for (int i = 0; i < 5; i++) {
            System.out.print(cap[i]);
        }
    }
}
