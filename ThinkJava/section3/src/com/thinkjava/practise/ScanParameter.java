package com.thinkjava.practise;

import java.util.Scanner;

/**
 * 验证输入
 */
public class ScanParameter {
    public static void main(String[] args){
        scanDouble();
        int count = 5;
        newLines(2);
        countdown(count);
        newLines(2);
        countup(count);
        newLines(2);
        displayBinary(23);
        newLines(1);
    }

    /**
     * 计算参数 x 的 log 值
     * @param x double
     */
    public static void printLogarithm(double x){
        if (x <= 0.0){
            System.err.println("Error: x must be positive.");
            return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is " + result);
    }

    /**
     * 要求用户输入一个浮点数，并调用求 log 值函数，求该数的 log 值
     */
    public static void scanDouble(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        //判断用户输入是否为 double, 如果不是，则终止。
        if (!in.hasNextDouble()){
            String word = in.next();
            System.err.println(word + " is not a number!");
            return;
        }
        double x = in.nextDouble();
        printLogarithm(x);
    }

    /**
     * 递归示例
     */

    public static void countdown(int n){
        if (n == 0){
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void countup(int n){
        if (n == 0){
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }

    /**
     * 打印空行
     * @param n int, 打印 n 个空行
     */

    public static void newLines(int n){
        if(n > 0){
            System.out.println();
            newLines(n - 1);
        }
    }

    /**
     * 计算给定整数的二进制数。
     * @param value，要求二进制数的整数。
     */
    public static void displayBinary(int value){
        if (value > 0){
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }
}
