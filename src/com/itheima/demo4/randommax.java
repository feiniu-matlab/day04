package com.itheima.demo4;

import java.util.Random;

public class randommax {
    public static void main(String[] args) {
        int[]num = new int[10];
        int sum = 0;
        double avg ;
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            Random r = new Random();
            int number = r.nextInt(100)+1;
            num[i] = number;
            sum = sum + num[i];
            System.out.println(num[i]);
        }
        System.out.println(sum);
        avg = sum/10.0;
        System.out.println(avg);
        for (int i = 0; i < num.length; i++) {
            if (num[i]<avg) {
                count++;
            }
            }
        System.out.println(count);
        }

    }

