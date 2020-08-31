class Test{
    public static void main(String[] args){
        Time t1 = new Time(13, 5, 56);
        Time t2 = new Time(12, 4, 57);
        Time t3 = new Time(12, 4, 42);
        Time t4 = new Time(12, 7, 10);
        Time t5 = new Time(21, 43, 30);
        Time[] t = {t1, t2, t3, t4, t5};

        System.out.println("questions 1 and 2.");
        for(int i = 0; i < t.length; i++){
            System.out.println(t[i] + " = " + t[i].toSeconds() + " sec");
        }
        System.out.println();

        System.out.println("question 3.");
        System.out.println(t[0] + ", " + t[0] + ", " + t[0].compareTo(t[0]));
        for(int i = 0; i < t.length - 1; i++){
            System.out.println(t[i] + ", " + t[i + 1] + ", " + t[i].compareTo(t[i + 1]));
        }
        System.out.println();

        System.out.println("question 4.");
        System.out.println("0 seconds = " + Time.secondsToTime(0));
        System.out.println("135 seconds = " + Time.secondsToTime(135));
        System.out.println("60000 seconds = " + Time.secondsToTime(60000));
        System.out.println("86399 seconds = " + Time.secondsToTime(86399));
        System.out.println();

        System.out.println("question 5.");
        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t.length; j++){
                System.out.println(t[i] + ", " + t[j] + ", " + Time.difference(t[i], t[j]));
            }
        }
        System.out.println();

        System.out.println("question 6.");
        Time tAdd;
        tAdd = new Time(0, 5, 6);
        System.out.println(t1 + " + " + tAdd + " = " + t1.add(tAdd));
        tAdd = new Time(4, 55, 7);
        System.out.println(t1 + " + " + tAdd + " = " + t1.add(tAdd));
        tAdd = new Time(12, 0, 0);
        System.out.println(t1 + " + " + tAdd + " = " + t1.add(tAdd));
        tAdd = new Time(23, 59, 59);
        System.out.println(t1 + " + " + tAdd + " = " + t1.add(tAdd));

    }
}

// Desired output:

// questions 1 and 2.
// 13:05:56 = 47156 sec
// 12:04:57 = 43497 sec
// 12:04:42 = 43482 sec
// 12:07:10 = 43630 sec
// 21:43:30 = 78210 sec

// question 3.
// 13:05:56, 13:05:56, 0
// 13:05:56, 12:04:57, 3659
// 12:04:57, 12:04:42, 15
// 12:04:42, 12:07:10, -148
// 12:07:10, 21:43:30, -34580

// question 4.
// 0 seconds = 00:00:00
// 135 seconds = 00:02:15
// 60000 seconds = 16:40:00
// 86399 seconds = 23:59:59

// question 5.
// 13:05:56, 13:05:56, 00:00:00
// 13:05:56, 12:04:57, null
// 13:05:56, 12:04:42, null
// 13:05:56, 12:07:10, null
// 13:05:56, 21:43:30, 08:37:34
// 12:04:57, 13:05:56, 01:00:59
// 12:04:57, 12:04:57, 00:00:00
// 12:04:57, 12:04:42, null
// 12:04:57, 12:07:10, 00:02:13
// 12:04:57, 21:43:30, 09:38:33
// 12:04:42, 13:05:56, 01:01:14
// 12:04:42, 12:04:57, 00:00:15
// 12:04:42, 12:04:42, 00:00:00
// 12:04:42, 12:07:10, 00:02:28
// 12:04:42, 21:43:30, 09:38:48
// 12:07:10, 13:05:56, 00:58:46
// 12:07:10, 12:04:57, null
// 12:07:10, 12:04:42, null
// 12:07:10, 12:07:10, 00:00:00
// 12:07:10, 21:43:30, 09:36:20
// 21:43:30, 13:05:56, null
// 21:43:30, 12:04:57, null
// 21:43:30, 12:04:42, null
// 21:43:30, 12:07:10, null
// 21:43:30, 21:43:30, 00:00:00

// question 6.
// 13:05:56 + 00:05:06 = 13:11:02
// 13:05:56 + 04:55:07 = 18:01:03
// 13:05:56 + 12:00:00 = 01:05:56
// 13:05:56 + 23:59:59 = 13:05:55