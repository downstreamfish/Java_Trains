public class Date
{
	/**
	 * @param day for week
	 * @param date for day
	 * @param month is month
	 * @param year is year
	 */
	public Date(String  day, int date, String month, int year){
		this.day = day;
		this.date = date;
		this.month = month;
		this.year = year;
	}
	private String day;
	private int date;
	private String month;
	private int year;
	public void printDate(){
		System.out.println("day : " + day + "\ndate : " + date +
			     "\nmonth : " + month + "\nyear : " + year + "\n");
	}
	public void printADate(){
		System.out.println("American format:\n" + day + ", " + month + " " + date
				+ ", " + year + "\n");
	}
	public void printEDate(){
		System.out.println("European format:\n" + day + " " + date + " " + month
				+ " " + year);
	}
	public static void main(String[] args){
		Date today = new Date("sunday", 5, "august", 2018);
		today.printDate();
		today.printEDate();
		today.printADate();
	}
}
