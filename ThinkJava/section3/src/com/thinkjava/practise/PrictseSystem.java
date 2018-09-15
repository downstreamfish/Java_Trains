package com.thinkjava.practise;

import java.util.Scanner;

public class PrictseSystem {
    public static void main(String[] args){
        System.out.println(System.out);

        String line;
        Scanner in = new Scanner(System.in);
        /*
        //echo
        System.out.print("Type something: ");
        line = in.nextLine();
        System.out.println("You said: " + line);

        System.out.print("Type something else: ");
        line = in.nextLine();
        System.out.println("You also said: " + line);
        */

        //从英寸到厘米的转换
        final double CM_PER_INCH = 2.54;
        int inch;
        double cm;
        System.out.print("How many inches? ");
        inch = in.nextInt();
        cm = inch * CM_PER_INCH;
        System.out.print(inch + "in = ");
        System.out.printf("%.3fcm\n", cm);
        //从厘米到英寸的转换
        inch = (int)(cm / CM_PER_INCH);
        System.out.printf("%fcm = %din\n", cm, inch);
    }
}
