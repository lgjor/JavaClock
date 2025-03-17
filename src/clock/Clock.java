package clock;

public abstract class Clock{
    protected Hour hour;
    protected Minute minute;
    protected Second second;

	public Clock(){
		this.hour = new Hour(0);
		this.minute = new Minute(0);
		this.second = new Second(0);
	}

	public int getHour() {
		return hour.getHour(hour);
	}

	public abstract void setHour(Hour hour);

	public Minute getMinute() {
		return minute;
	}

	public Second getSecond() {
		return second;
	}

	public String getTime(){
		return hour + " : " + minute + " : " + second; // Uses overridden toString()
	}
    
	public abstract Clock convert(Clock clock); 
}


