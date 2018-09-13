import java.util.Scanner;
/**
 * 将用户输入的秒数转换为小时数、分钟数和秒数。
 * @version 0.1 2018-8-6
 */
public class TimeConvert
{
	public static void main(String [] args){
		int hours, minutes, seconds, time;
		final int SECOND_PER_MINUTE = 60;
		final int SECOND_PER_HOUR = 3600;

		Scanner in = new Scanner(System.in);
		//１提示用户输入秒数
		System.out.print("请输入秒数：");
		//２从键盘读取一个整数
		time = in.nextInt();
		
		//３计算结果
		minutes = time / SECOND_PER_MINUTE;
		seconds = time % SECOND_PER_MINUTE;
		hours = minutes / SECOND_PER_MINUTE;
		minutes = minutes % SECOND_PER_MINUTE;
		//４打印结果，格式如　5000seconds = 1hours, 23minuts, and 20seconds
		System.out.printf("%dseconds = %dhours, %dminutes, and %dseconds\n", 
				time, hours, minutes, seconds);
	}
}
