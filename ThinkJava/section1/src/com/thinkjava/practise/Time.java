package com.thinkjava.practise;

public class Time {
    public static void main(String[] args){
        int hour = 21;
        int minute = 57;
        int second = 33;

        //计算显示从午夜开始过去多少秒
        int passedSecond = 21 * 60 * 60 + 57 * 60 + 33;
        System.out.print("Day seconds passed: ");
        System.out.println(passedSecond);
        //计算显示当天还剩下多少秒
        int remainSecond = (23 - hour) * 60 * 60 + (59 - minute) * 60 + (60 - second);
        System.out.print("Day seconds remain: ");
        System.out.println(remainSecond);

        //计算并显示当天已逝去时间的百分比
        double daySeconds = 24 * 60.0 * 60.0;
        System.out.print("Percent of the senconds that has passed: ");
        System.out.println(passedSecond / daySeconds);
    }
}
