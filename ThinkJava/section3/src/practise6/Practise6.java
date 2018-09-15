package practise6;

/**
 * Think Java 第 6 章课后练习
 */
public class Practise6 {
    public static void main(String[] args){
        System.out.println(isDivisible(4, 2));
        System.out.println(isDivisible(5, 2));
        System.out.println(isTriagle(3, 4, 5));
        System.out.println(isTriagle(1, 5 ,2));
    }

    /**
     * 判断整数 n 能否被整数 m 整除
     * 如果能，返回 true，否则返回false
     */
    public static boolean isDivisible(int n, int m){

        boolean flag = false;
        if (n % m == 0){
            flag = true;
        }
        return flag;
    }

    /**
     * 判断三个整数能否组成一个三角形
     */

    public static boolean isTriagle(int a, int b, int c){
        return ((a + b) > c) && ((a + c) > b) && ((b + c) > a);
    }

}
