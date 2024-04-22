package com.itheima.demo4;

public class zhishudemo {
    public static void main(String[] args) {
        int count = 0;
        for (int value = 101; value <= 200; value++) {
            boolean flag = true;
            for (int i = 2; i <= (value - 1); i++) {
                if (value % i == 0) {
                    flag = false;
                    //break 跳出的单层循环
                    break;
                }
            }
            if (flag){
                count++;
            }
        }
        System.out.println("素数的个数为："+ count);
    }
}
