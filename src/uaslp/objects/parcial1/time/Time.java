package uaslp.objects.parcial1.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public int getSecond(){
        return second;
    }

    public void addHour(int delta){
        hour += delta;
        if(hour > 23){
            while(hour > 23)
                hour -= 24;
        }
        else{
            if(hour < 0){
                while(hour < 0)
                    hour += 24;
            }
        }
    }

    public void addMinute(int delta){
        minute += delta;
        if(minute > 59){
            while(minute > 59){
                minute -= 60;
                addHour(1);
            }
        }
        else{
            if(minute < 0){
                while(minute < 0){
                    minute += 60;
                    addHour(-1);
                }
            }
        }
    }

    public void addSecond(int delta){
        second += delta;
        if(second > 59){
            while(second > 59){
                second -= 60;
                addMinute(1);
            }
        }
        else{
            if(second < 0){
                while(second < 0){
                    second += 60;
                    addMinute(-1);
                }
            }
        }
    }

    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
