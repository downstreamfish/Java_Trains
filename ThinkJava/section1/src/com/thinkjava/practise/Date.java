package com.thinkjava.practise;

public class Date {
    public static void main(String[] args){
        // 定义变量，day 代表星期
        String day = "Friday";
        // date 代表日期
        int date = 14;
        // month 代表月份
        String month = "September";
        // year 代表年份
        int year = 2018;

        // 打印中间值
        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);

        // 打印美国格式时间
        System.out.println("American format: ");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        //打印欧洲格式时间
        System.out.println("European format: ");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}
