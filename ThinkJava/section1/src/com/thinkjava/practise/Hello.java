package com.thinkjava.practise;

public class Hello {

    public static void main(String[] args) {
        //生成一些简单的输出
        System.out.println("Hello world!");
        System.out.println("How are you?");
        //使用转义序列"\n"
        System.out.print("Hello!\nHow are you doing?\n");
        System.out.println("She said \"Hello!\" to me.");

        //定义变量名
        String firstLine = "Hello, again!";
        System.out.println(firstLine);

        int hour = 11;
        int minute = 59;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

        //算术运算
        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute);

        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60);

        System.out.print("Percent of the hour that has passed: ");
        System.out.println(minute * 100 / 60);

        //double dminute = 59.0;
        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60.0);
        //舍入误差，以下两个输出结果在不同计算机上可能不同, 浮点数误差。
        System.out.println(0.1 * 10);
        System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1
                         + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);

        //字符串运算符
        System.out.println(1 + 2 + "Hello");
        System.out.println("Hello" + 1 + 2);
    }
}
