package by.overone.lesson8;

public class Time {

    private int hour;
    private int minutes;
    private int second;

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        } else {
            System.out.println("Data is not protected!!!" + "\n"
                    + " You entered the wrong time format, hour interval 0h-23h");
        }
    }

    public int getHour() {
        return hour;
    }

    public void setMinutes(int minutes) {
        if (minutes > 0 && minutes < 60) {
            this.minutes = minutes;
        } else {
            System.out.println("Data is not protected!!!" + "\n"
                    + " You entered the wrong time format, minutes interval 0m-59m");
        }
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSecond(int second) {
        if (second > 0 && second < 60) {
            this.second = second;
        } else {
            System.out.println("Data is not protected!!!" + "\n"
                    + " You entered the wrong time format, second interval 0s-59s");
        }
    }

    public int getSecond() {
        return second;

    }

    public int justSecond() {
        if (hour == 0) {
            return hour + (minutes * 60) + second;
        } else
            return (hour * 3600) + (minutes * 60) + second;
    }

}
