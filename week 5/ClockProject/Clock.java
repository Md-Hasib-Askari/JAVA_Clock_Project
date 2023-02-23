package ClockProject;

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {
        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }
    public Clock(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = (seconds % 3600) / 60;
        this.seconds = (seconds % 3600) % 60;
    }
    public Clock(int hours, int minutes, int seconds) {

        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        int currentSeconds = getInSecond(this);
        this.hours = (currentSeconds / 3600);
        currentSeconds -= this.hours*3600;
        this.hours %= 24;
        this.minutes = currentSeconds / 60;
        currentSeconds -= this.minutes*60;
        this.seconds = currentSeconds;

    }

    public void setClock(int seconds) {
        this.hours = seconds / 3600;
        this.minutes = (seconds % 3600) / 60;
        this.seconds = (seconds % 3600) % 60;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void addClock(Clock obj) {
         int currentSeconds = (getInSecond(this) + getInSecond(obj));
         this.hours = (currentSeconds / 3600);
         currentSeconds -= this.hours*3600;
        this.hours %= 24;
        this.minutes = currentSeconds / 60;
         currentSeconds -= this.minutes*60;
         this.seconds = currentSeconds;
    }

    public Clock subtractClock(Clock obj) {
        Clock newObj = new Clock(this.hours, this.minutes, this.seconds);
        int currentSeconds = Math.abs(getInSecond(newObj) - getInSecond(obj));
        newObj.setHours(currentSeconds / 3600);
        currentSeconds -= newObj.getHours()*3600;
        newObj.setHours(getHours() % 24);
        newObj.setMinutes(currentSeconds / 60);
        currentSeconds -= newObj.getMinutes()*60;
        newObj.setSeconds(currentSeconds);
        return newObj;
    }

    public void tick() {
        int currentSeconds = getInSecond(this) + 1;
        this.hours = (currentSeconds / 3600);
        currentSeconds -= this.hours*3600;
        this.hours %= 24;
        this.minutes = currentSeconds / 60;
        currentSeconds -= this.minutes*60;
        this.seconds = currentSeconds;
    }

    public void tickDown() {
        int currentSeconds = getInSecond(this) - 1;
        this.hours = (currentSeconds / 3600);
        currentSeconds -= this.hours*3600;
        this.hours %= 24;
        this.minutes = currentSeconds / 60;
        currentSeconds -= this.minutes*60;
        this.seconds = currentSeconds;
    }

    public int getInSecond(Clock obj) {
        return (obj.getHours()*3600 + obj.getMinutes()*60 + obj.getSeconds());
    }

    public String toString() {
        int[] time = new int[] {this.hours, this.minutes, this.seconds};
        String[] str = new String[3];

        for (int i = 0; i < 3; i++) {
            if (time[i] / 10 == 0) {
                str[i] = "0" + time[i];
            } else {
                str[i] = String.valueOf(time[i]);
            }
        }
        return ("\""+str[0]+":"+str[1]+":"+str[2]+"\"");
    }
}
