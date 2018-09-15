package com.thinkjava.practise;

import java.util.Scanner;
import java.util.Random;

/**
 * 一个猜数游戏
 */
public class GuessStarter {
    public static void main(String[] args){
        int guess, randomNumber;
        Scanner in = new Scanner(System.in);

        // 生成一个随机数
        Random random = new Random();
        randomNumber = random.nextInt(100) + 1;


        System.out.println("I'm thinking of a number between 1 and 100\n" +
                "(including both). Can you guess what it is?");
        System.out.print("Type a number: ");

        // 读取一个用户输入的整数
        guess = in.nextInt();

        System.out.printf("Your guess is: %d\n", guess);
        System.out.printf("The number I was Thinking of is: %d\n", randomNumber);
        System.out.println("You were off by: " + (guess - randomNumber));
    }
}
