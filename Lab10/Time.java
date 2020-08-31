// A class that implements a time object in a 24-hour format.
// The class contains three instance variables: hour, minute, and second.
// The smallest time (in international format) is 00:00:00, and the largest one is 23:59:59.
// The mod operator % can be useful when doing conversions or operations on time values.

class Time implements Comparable<Time>{
    private final int hour; // an integer in the interval [0, 23].
    private final int minute; // an integer in the interval [0, 59].
    private final int second; // an integer in the interval [0, 59].

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // question 1.
    // Returns a string representation of this time in international format, i.e. hh:mm:ss.
    // For example, hour=13, minute=5, second=56 returns "13:05:56".
    public String toString(){
        String h;
        String m;
        String s;
        if(this.hour < 10){
            h = "0" + this.hour;
        }else{
            h = "" + this.hour;
        }

        if(this.minute < 10){
            m = "0" + this.minute;
        }else{
            m = "" + this.minute;
        }

        if(this.second < 10){
            s = "0" + this.second;
        }else{
            s = "" + this.second;
        }

        return (h + ":" + m + ":" + s);
    }

    // question 2.
    // Returns this time in seconds.
    // For example, hour=13, minute=5, second=56 returns 47156.
    public int toSeconds(){
        return this.hour * 3600 + this.minute * 60 + this.second;
    }

    // question 3.
    // Compares this time to a time t, and returns
        // a negative value, if this time precedes t.
        // 0, if this time equals t.
        // a positive value, if this time succeeds t.
    // The simplest way to implement this function is to return the difference in seconds between this time and t.
    public int compareTo(Time t){
        return this.toSeconds() - t.toSeconds();
    }

    // question 4.
    // The function secondsToTime is static, it does not use the keyword this, i.e., this.hour, this.minute, and this.second cannot be accessed here.
    // Input: a positive integer s in the interval [0, 86399].
    // Converts s, the amount of seconds, to a new time object (expressed in hour, minute, and second).
    // Returns the new time object.
    public static Time secondsToTime(int s){
        int m = s / 60;
        s = s % 60;
        int h = m / 60;
        m = m % 60;
        Time t = new Time(h, m, s);
        return t;
    }

    // question 5.
    // The function difference is static, it does not use the keyword this, i.e., this.hour, this.minute, and this.second cannot be accessed here.
    // Input: two time objects t1 and t2.
    // Returns
        // a new time object that corresponds to the difference in time between t1 and t2, if t1 precedes t2.
        // a new time object with hour=0, minute=0, second=0, if t1 equals t2.
        // null, if t1 succeeds t2.
    public static Time difference(Time t1, Time t2){
        int diff = t2.toSeconds() - t1.toSeconds();
        if(diff < 0){
            return null;
        }
        return secondsToTime(diff);
    }

    // question 6.
    // Adds this time to t, and returns the result as a new time object.
    // The output time cannot exceed 23:59:59, and it "wraps around" after that value is reached.
    public Time add(Time t){
        int sum = this.toSeconds() + t.toSeconds();
        sum -= 86400 * (sum / 86400);
        return secondsToTime(sum);
    }
}