package clock;

public class Minute {
    private final int minute;

    public Minute(int minute) {
        if (minute >= 60) {
            this.minute = 60;
        } else {
            this.minute = minute;
        }
    }

    public int getMinute() {
        return minute;
    }

    @Override
    public String toString() {
        return String.format("%02d", minute);
    }
}


