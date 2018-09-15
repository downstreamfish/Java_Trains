package Practise7;

import java.util.Random;

/**
 * Think Java 第 8 章数组代码练习
 */
public class Practise8 {
    public static void main(String[] args){
        int numValue = 8;
        int[] array = randomArray(numValue);
        printArray(array);
    }

    /**
     * 用 0~100 的随机数填充长度为 size 的数组。
     * @param size 数组的长度
     * @return 返回填入随机数的数组
     */
    public static int[] randomArray(int size){
        Random random = new Random();
        int[] a = new int[size];
        for(int i = 0; i < a.length; i++){
            a[i] = random.nextInt(100);
        }
        return a;
    }

    /**
     * 打印数组中的元素
     */
    public static void printArray(int[] a){
        System.out.print("{" + a[0]);
        for(int i = 1; i < a.length; i++){
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }

    /**
     * 返回数组中的值在区间 low (闭) 到 high (开) 中元素个数
     * @param a 数组，要统计元素的数组
     * @param low 统计元素值的下限，包含 low
     * @param high 统计元素值的上限，步包含 high
     * @return 返回符合条件的元素的个数
     */
    public static int inRange(int[] a, int low, int high){
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if(a[i] >= low && a[i] < high){
                count ++;
            }
        }

        return count;
    }
}
