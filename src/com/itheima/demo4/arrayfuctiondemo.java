package com.itheima.demo4;

public class arrayfuctiondemo {
    public static void main(String[] args) {
        int[] age = {11, 992, 39, 447, 5, 447, 997, 887, 447};
        printarray(age);
        maxvalue(age);
        exit(age, 47);

        int[] copyarr = cppyOfRange(age, 2, 7);
        for (int i = 0; i < copyarr.length; i++) {
            System.out.print(copyarr[i] + " ");
        }
        System.out.println("heloo world");
    }

    public static void printarray(int[] array) {
        System.out.print('[');
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println(']');
    }

    public static void maxvalue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("数组中最大数值为：" + max);
    }

    public static void exit(int[] array, int exitvalue) {
        System.out.println("比较值为" + exitvalue);
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == exitvalue) {
                System.out.println("第" + (i + 1) + "个值与其相同");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("数组中无值与之匹配");
        }
    }

    public static int[] cppyOfRange(int[] array, int from, int to) {
        int[] newarray = new int[to - from];
        int flag = 0;
        for (int i = from; i < to; i++) {
            newarray[flag] = array[i];
            flag++;
        }
        return newarray;
    }


}
