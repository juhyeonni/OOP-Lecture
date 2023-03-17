class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour, int minute, int second) {
        this.hour = (hour >= 0 && hour < 24) ? hour : 0;
        this.minute = (minute >= 0 && minute < 60) ? minute : 0;
        this.second = (second >= 0 && second < 60) ? second : 0;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println("기본 생성자 호출 후 시간: " + time);

        Time time2 = new Time(13, 27, 6);
        System.out.println("두번째 생성자 호출 후 시간: " + time2);

        Time time3 = new Time(99, 66, 77);
        System.out.println("올바르지 않은 시간 설정 후 시간: " + time3);
    }
}