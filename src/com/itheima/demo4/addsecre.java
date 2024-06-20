package com.itheima.demo4;

public class addsecre {
    public static void main(String[] args) {
        /*
        数字加密
        需求
        某系统的数字密码（大于0），比如1983，采用加密方式进行传输
        规则如下：
        先得到每位数，然后每位数都加上5，在对10求余，最后将所有数字翻转，得到一串新数

        思路：
        定义一个数组，存放数字
         */
        int[]array = {5,3,6,9,7};
        int[]secret = new int[5];
        int tmp;
        for (int i = 0; i < array.length; i++) {
            secret[i] = (array[i] + 5) % 10;
            System.out.println(secret[i]);
        }
        for (int i = 0,j = secret.length - 1; i < j; i++,j--) {
            tmp = secret[i];
            secret[i] = secret[j];
            secret[j] = tmp;
        }
        for (int i = 0; i < secret.length; i++) {
            System.out.println(secret[i]);
        }

    }
}
