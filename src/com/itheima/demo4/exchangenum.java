package com.itheima.demo4;

public class exchangenum {
    public static void main(String[] args) {
        int [] num = {1,2,3,4,5};
        int content;
        int j = num.length - 1;
        for (int i = 0; i<j; i++) {
            content = num[j];
            num[j] = num[i];
            num[i] = content;
            j--;
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
        }

    }
}
