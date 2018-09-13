public class Time
{
	public static void main(String[] args){
		Time now = new Time(22, 6, 55);
		now.fliedTime();
		now.leftTime();
		now.fliedPercent();
	}

	private int hour;
	private int minute;
	private int second;

	public void fliedTime(){
		int sumTime = second + minute * 60 + hour * 60 * 60;
		System.out.println("It has " + sumTime + " seconds from middle night");
	}

	public void leftTime(){
		int lefttime = (60 - second) + (59 - minute) * 60 + (23 - hour) * 60 * 60;
		System.out.println("today has left " + lefttime + " seconds");

	}
	public void fliedPercent(){
		int fliedTime = second + minute * 60 + hour * 60 * 60;
		double totalTime = 24.0 * 60 * 60;
		double percent = fliedTime / totalTime;
		System.out.println("Flied Percent is: " + percent);
	}
	public Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
}
