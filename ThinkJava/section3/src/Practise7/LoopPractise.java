package Practise7;

public class LoopPractise {
    public static void main(String[] args){
        printLogE(10);
        printLog2(10);
    }

    // 打印以 e 为底数的对数表
    public static void printLogE(int n){
        int i = 1;
        while (i < n){
            double x = (double) i;
            System.out.println(x + " " + Math.log(x));
            i++;
        }
    }

    // 打印以 2 为底数的对数表
    public static void printLog2(int n){
        int i = 1;
        while (i < n){
            double x = (double)i;
            System.out.println(x + " " + Math.log(x) / Math.log(2));
            i = i * 2;
        }
    }
}
