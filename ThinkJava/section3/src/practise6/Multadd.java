package practise6;

/**
 * 乘加运算的实现
 */
public class Multadd {
    public static void main(String[] args){
        System.out.println(multadd(1.0, 2.0, 3.0));
        System.out.println(multadd(3.0, 5.5, 8.9));

        System.out.println(multadd(Math.sin(multadd(Math.PI, 0.5, 0)), 1,
                multadd(Math.cos(multadd(Math.PI, 0.25, 0)), 0.5, 0)));
        //System.out.print(multadd(Math.sin(Math.PI * 0.5), 1, Math.cos(Math.PI * 0.25) * 0.5));
        System.out.println(multadd(Math.log(10), 1.0, Math.log(20)));

        System.out.println(expSum(3.0));

        System.out.println("---------------------------------");
        System.out.println(prod(1, 4));
        System.out.println(oddSum(15));
        System.out.println("ack: " + ack(3, 3));
        for(int i = 0; i < 10; i++){
            System.out.println(power(2.0, i));
        }
    }

    public static double multadd(double a, double b, double c){
        return a * b + c;
    }

    public static double expSum(double x){
        return multadd(multadd(x, Math.pow(Math.E, -x), 0.0), 1.0, Math.sqrt(1 - Math.pow(Math.E, -x)));
    }

    public static int prod(int m, int n){
        if ( m == n){
            return n;
        } else {
            //int recurse = prod(m, n - 1);
            //int result = n * recurse;
            //return result;

            return n * prod(m, n - 1);
        }
    }

    // 判断一个数是否是正奇数
    public static boolean isOdd(int n){
        boolean flag = false;
        if (n > 0 && n % 2 != 0){
            flag = true;
        }
        return flag;
    }
    // 使用递归方法，接受一个正奇数，返回 1 ~ n (闭区间) 的所有奇数的和。
    public static int oddSum(int n){
        if (n == 1){
            return n;
        }else {
            int temp = oddSum(n - 2);
            int result = n + temp;
            return result;

        }
    }

    // 计算阿克曼函数的值
    public static int ack(int m, int n){
        if ( m == 0){
            return n + 1;
        } else if (m != 0 && n == 0){
            return ack(m - 1, 1);
        } else {
            return ack(m - 1, ack(m, n - 1));
        }
    }
    // 使用递归实现给定参数 x 的 n 次方。
    public static double power(double x, int n){
        if (n == 0){
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

}
