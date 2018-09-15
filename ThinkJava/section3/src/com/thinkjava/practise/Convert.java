package com.thinkjava.practise;

import java.util.Scanner;
/**
 * 将厘米数转换为英尺数和英寸数
 */
public class Convert {
    public static void main(String[] args){
        double cm;
        int feet, inches, remainder;
        final double CM_PER_INCH = 2.54;
        final int IN_PER_FOOT = 12;
        Scanner in = new Scanner(System.in);

        //提示用户输入值并读取这个值
        System.out.print("Exactly how many cm?");
        cm = in.nextDouble();

        //转换并输出结果
        inches = (int)(cm / CM_PER_INCH);
        feet = inches / IN_PER_FOOT;
        remainder = inches % IN_PER_FOOT;
        System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
    }
}
