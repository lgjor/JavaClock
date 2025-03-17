package clock;

public class BrlClock extends Clock{

	@Override
    public Clock convert(Clock clock) {
		this.second = clock.getSecond();
        this.minute = clock.getMinute();
		switch (clock) {
			case USClock usClock -> 
				this.hour = new Hour(
						(usClock.getPeriodIndicator().equals("PM") ?
						 usClock.getHour() + 12 :
						 usClock.getHour()
						)
				);
			case BrlClock brlClock -> 
				this.hour = new Hour(brlClock.getHour());
			default -> 
				throw new IllegalArgumentException("Unsupported clock type: " + clock.getClass().getName());
		}
		return this;
	} 

	@Override
	public void setHour(Hour hour){
		this.hour=hour;
	}
    
}
