package clock;

public class Hour {
    private final int hour;

    public Hour (int hour) {
        if (hour >= 24){
            this.hour = 24;
            return;
        }
        this.hour = hour;
    }        

    public int getHour(Hour hour) {
        return this.hour;
    }
    
    @Override
    public String toString() {
        return String.format("%02d", hour); // Ensures two-digit formatting
    }
}
