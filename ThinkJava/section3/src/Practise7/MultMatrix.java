package Practise7;

/**
 * 打印乘法表。
 */
public class MultMatrix {
    public static void main(String[] args){
        printTable(9);

        System.out.println("square 9: " + squareRoot(9));

        System.out.println("power(2, 1) = " + power(2, 5));

        System.out.println("factorial(5) = " + factorial(5));

        for(double i = 0.1; i <= 100.0; i = i * 10) {
            check(i);
        }

        for(double i = -0.1; i >= -100.0; i = i * 10){
            check(i);
        }

        System.out.println(gauss(1, 4));

    }

    // 打印一行
    public static void printRow(int n, int cols){
        int i = 1;
        while (i <= cols){
            System.out.printf("%4d", i * n);
            i++;
        }
        System.out.println();
    }

    // 打印乘法表
    public static void printTable(int rows){
        int i = 1;
        while (i <= rows){
            printRow(i, i);
            i++;
        }
    }

    /**
     * 计算平方根的近似值
     */
    public static double squareRoot(double a){
        double x0, x1 = a / 2.0;
        do{
            x0 = x1;
            x1 = (x0 + a / x0) / 2.0;
        } while (Math.abs(x1 - x0) > 0.0001);
        return x1;
    }

    /**
     * 用循环实现幂的计算
     */
    public static double power(double x, int n) {
        double result = 1;
        for (int i = 1; i <= n; i++){
            result = result * x;

        }
        return result;
    }

    /**
     * 使用循环实现阶乘
     */

    public static int factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result = result * i;
        }
        return result;
    }

    /**
     * 计算自然底数 e 的 x 次方的近似值
     */
    public static double myexp(double x, int n){
        double result = 0;
        for (int i = 0; i <= n; i++){
            result += power(x, i) / factorial(i);
        }
        return result;
    }

    /**
     * 计算自然底数 e 的 x 次方的近似值，循环方法实现
     */
    public static double myexp2(double x, int n){
        double result = 0.0;

        return result;
    }
    /**
     * 比较函数 myexp(x) 和 Math.exp(x) 的结果
     */
    public static void check(double x){
        System.out.printf("%.1f\t%f\t%f\n", x, myexp(x, 10), Math.exp(x));
    }

    /**
     * 计算 exp(-x^2) 的近似值
     */
    public static double gauss(double x, int n){
        int symbol = -1;
        double current = 1;
        double pre = 0.0;
        double result = 0.0;
        for (int i = 1; i <= n; i++){
            result += current;
            pre = current;
            current = symbol * pre * x * x / i;
            System.out.println("pre: " + pre + "\tcurrent: " + current);
        }
        return result;
    }

}
