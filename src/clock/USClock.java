package clock;

public class USClock extends Clock{

    private String periodIndicator;

    public String getPeriodIndicator() {
		return this.periodIndicator;
	}

    public void setAfterMidDay() {
    	this.periodIndicator = "PM";
    }
    
    public void setBeforeMidDay() {
    	this.periodIndicator = "AM";
    }
    
    @Override
    public void setHour(Hour hour) {
        int hourInSet;
        hourInSet = hour.getHour(hour);
    	if ( (hourInSet > 12) && (hourInSet < 23) ) {
        	setAfterMidDay(); // Sets "PM" between 12 and 23
            this.hour = new Hour(hourInSet - 12);
        }
        else if (hourInSet >= 24){
        	setBeforeMidDay(); // Sets "AM" for 24 or more
        	this.hour = new Hour(0);
        }
        else {
            setBeforeMidDay(); // Sets "AM" for hours 0 to 12
        	this.hour = new Hour(hourInSet);
        }
    }

    @Override
    public Clock convert(Clock clock) {
        switch (clock) {
            case USClock usClock -> {
                this.hour = new Hour(usClock.getHour());
                this.periodIndicator = usClock.getPeriodIndicator();
            }
            case BrlClock brlClock -> 
                this.hour = new Hour(brlClock.getHour());

            default -> throw new IllegalArgumentException("Unsupported clock type: " + clock.getClass().getName());
        }
		return this;  
    }

	public void setPeriodIndicator(String periodIndicator) {
		this.periodIndicator = periodIndicator;
	}

    @Override
    public String getTime() {
        return super.getTime() + " " + this.getPeriodIndicator();
    }

}
