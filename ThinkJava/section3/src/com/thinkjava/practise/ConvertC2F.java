package com.thinkjava.practise;

import java.util.Scanner;

/**
 * 将摄氏温度转换为华氏温度
 */

public class ConvertC2F {
    public static void main(String[] args){
        double cels, fahs;
        final double CONVERT_POW = 9.0 / 5.0;
        final double COMP = 32.0;
        Scanner in = new Scanner(System.in);

        // 1. 提示用户输入摄氏温度
        System.out.print("请输入摄氏温度：");

        // 2. 从键盘读取一个double值
        cels = in.nextDouble();

        // 3. 计算结果
        fahs = cels * CONVERT_POW + COMP;

        // 4. 将输出设置为包含一位小数
        System.out.printf("%.1fC = %.1fF\n", cels, fahs);
    }
}
