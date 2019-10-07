package Unit3.Time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        hour = 0;
        minute = 0;
        second  = 0;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time{" + hour +
                ":" + minute +
                ":" + second +
                '}';
    }

    public void setTime(int hour, int minute, int second) {
        if(hour < 23){
            this.hour = hour;
        }
        else{
            this.hour = 0;
        }
        if(minute < 59){
            this.minute = minute;
        }
        else{
            this.minute = 0;
        }
        if(second < 59){
            this.second = second;
        }
        else{
            this.second = 0;
        }
    }

    public void addTime(int hour, int minute, int second){
        this.second += second;
        if(this.second > 60){
            this.minute += this.second/60;
            this.second %= 60;
        }

        this.minute += minute;
        if(this.minute > 60){
            this.hour += this.minute/60;
            this.minute %= 60;
        }

        this.hour += hour;
        this.hour %= 24;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(hour < 23){
            this.hour = hour;
        }
        else{
            this.hour = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute < 59){
            this.minute = minute;
        }
        else{
            this.minute = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 59){
            this.second = second;
        }
        else{
            this.second = 0;
        }
    }
}
