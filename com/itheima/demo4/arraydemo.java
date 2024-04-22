package com.itheima.demo4;

public class arraydemo {
    public static void main(String[] args) {
        //格式：
        //静态初始化
        //完整格式：
        //数据类型 [] 数组名 = new 数据类型[]{元素1，元素2};
        int sum = 0;
        int count = 0;
        int [] age = {12,15,16,17,17};
        for (int i = 0; i < age.length; i++) {
            //System.out.println(age[i]);
            sum = sum + age[i];
            if (age[i] % 2 == 0){
                age[i] = age[i] / 2;
                System.out.println(age[i]);
            }else{
                age[i] = age[i] * 2;
                System.out.println(age[i]);
            }

        }
        System.out.println(age.length);
        System.out.println(sum);
        System.out.println(count);
    }
}
