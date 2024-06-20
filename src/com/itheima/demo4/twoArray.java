package com.itheima.demo4;

public class twoArray {
    public static void main(String[] args) {
        int yearsum = 0;
        int[][] array = new int[4][];
        int[] array1 = {22,66,44};
        int[] array2 = {77,33,88};
        int[] array3 = {25,45,65};
        int[] array4 = {22,66,44};
        array[0] = array1;
        array[1] = array2;
        array[2] = array3;
        array[3] = array4;
        //二维数组的遍历
        for (int i = 0; i < array.length; i++) {
            int seasonsum = 0;
            for (int i1 = 0; i1 < array[i].length; i1++) {
                seasonsum = seasonsum + array[i][i1];
            }
            System.out.println("第" + (i + 1 )+ "季度的总营业额为：" + seasonsum);
            yearsum = yearsum + seasonsum;
        }
        System.out.println("全年的总营业额为：" + yearsum);
    }
}
