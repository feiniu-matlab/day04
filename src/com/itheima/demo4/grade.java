package com.itheima.demo4;

import java.util.Arrays;
import java.util.Scanner;

/*在唱歌比赛中，有6名评委给选手打分，分数范围为【0-100】之间的整数。选手的最后得分为：去掉
最高分、最低分后的四个评委的平均分，请完成上述过程并计算出选手的得分*/
public class grade {
    public static void main(String[] args) {
        int tea_num = 6;
        System.out.println(getFinalgra(tea_num));
    }

    private static double getFinalgra(int tea_num) {
        double sum =0;
        double grade;
        double arr[] = getgrade(tea_num);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        grade = (sum - arr[0]-arr[arr.length-1])/(tea_num - 2);
        return grade;
    }

    public static double[] getgrade(int n) {
        double[] grade = new double[n];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n;) {
            System.out.println("请输入第" + (i+1) + "位评委的分数：");
            double gr = sc.nextDouble();
            if (gr>=0 && gr<=100){
                grade[i] = gr;
                i++;
            }else{
                System.out.println("请输入0~100以内的分数");
            }

        }
        return grade;
    }

}

