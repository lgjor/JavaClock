package clock;

public class Second {
    private final int second;

    public Second(int second) {
        if (second >= 60){
            this.second = 60;
            return;
        }
        this.second = second;
    }
    
    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%02d", second);
    }
}
