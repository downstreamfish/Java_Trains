package practise5;

/**
 * Java 编程思维第 5 章课后练习题
 */
public class Practise5 {
    public static void main(String[] args){

        checkFermat(3, 4, 5, 2);

        double area = circleArea(1.0, 2.0, 4.0, 6.0);
        System.out.printf("area = %.2f\n", area);
        for (int i = 1; i < 10; i++){
            System.out.println(fibonacci(i));
        }
    }

    /**
     * 验证费马大定理是否正确 pow(a, n) + pow(b, n) == pow(c, n)
     * 如果对于整数 a, b, c, n, 上述等式成立，且 n > 2, 则费马大定理不正确，
     * 否则费马定理正确。
     */
    public static void checkFermat(int a, int b, int c, int n){
        boolean resultEqual = (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n));

        if (resultEqual && n > 2){
            System.out.println("Holy smokes, Fermat was wrong!");
        } else {
            System.out.println("No, that doesn't work.");
        }
    }

    // 递归实现斐波那契数列
    public static int fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * 以下代码演示方法组合。
     * 给定圆心和圆周上的点，求圆的面积
     */

    // 求两点间的距离
    public static double distance(double x1, double y1, double x2, double y2){
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        double result = Math.sqrt(dsquared);
        return result;
    }
    // 求圆的面积
    public static double circleArea(double xc, double yc, double xp, double yp){
        double radius = distance(xc, yc, xp, yp);
        double area = calculateArea(radius);
        return area;
    }

    // 计算圆的面积
    public static double calculateArea(double radius){
        return Math.PI * radius * radius;
    }

}
