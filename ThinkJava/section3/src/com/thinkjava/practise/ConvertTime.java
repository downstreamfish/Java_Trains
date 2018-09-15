package com.thinkjava.practise;

import java.util.Scanner;

/**
 * 将秒数转换为小时数， 分钟数和秒数
 */

public class ConvertTime {
    public static void main(String[] args){

        int seconds, hours, minutes, remainder;

        final int TIME_RADIX = 60;
        Scanner in = new Scanner(System.in);

        // 1. 提示用户输入秒数
        System.out.print("输入要转换的秒数: ");

        // 2. 从键盘读取一个整数
        seconds = in.nextInt();

        // 3. 计算结果
        minutes = seconds / TIME_RADIX;
        remainder = seconds % TIME_RADIX;
        hours = minutes / TIME_RADIX;
        minutes = minutes % TIME_RADIX;

        // 4. 用 printf 显示输出

        System.out.printf("%d seconds = %d hours, %d minutes, and %d seconds\n",
                seconds, hours, minutes, remainder);
    }

}
