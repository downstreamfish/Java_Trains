import java.util.Scanner;
/**
 * 将摄氏温度转换为华氏温度
 * @version 0.1 2018-8-6
 *
 */
public class C2F
{
	public static void main(String[] args){
		double c, f;
		Scanner in = new Scanner(System.in);
		//1.提示用户输入摄氏温度
		System.out.print("请输入摄氏温度：");
		//2.从键盘读取一个double值
		c = in.nextDouble();
		//3.计算结果
		f = c * (9.0 / 5) + 32;
		//4.将结果输出，包含一个小数，如24.0C = 75.2F 
		System.out.printf("%.1fC = %.1fF\n", c, f);
	}
}

