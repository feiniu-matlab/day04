package com.itheima.demo4;

public class arraymax {
    public static void main(String[] args) {
        int [] age = {93,5,22,44,5,9};
        int max = age[0];
        for (int i = 1; i < age.length; i++) {
            if (max < age[i]){
                max = age[i];
            }

        }
        System.out.println("最大值为：" + max);
    }
}
