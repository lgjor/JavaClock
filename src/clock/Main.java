package clock;

public class Main {

	public static void main(String[] args) {
		Clock brlclock = new BrlClock();
		brlclock.second = new Second(65);
		brlclock.minute = new Minute(30);
		brlclock.setHour(new Hour(25));

		Clock usclock = new USClock();
		usclock.second = new Second(65);
		usclock.minute = new Minute(30);
		usclock.setHour(new Hour(15));

		System.out.println(brlclock.getTime());
		System.out.println(usclock.getTime());
		
	}
}
