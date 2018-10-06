
public class OurDate {
	
	private int day;
	private int month;
	private int year;
	 
	public OurDate()
	 {
		 day=0;
		 month=0;
		 year=0;
	 }

	public OurDate(int day,int month,int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public String toString()
	{
		return day+"/" + month + "/" + year ;
	}
	
}
