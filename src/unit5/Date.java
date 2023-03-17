class Date {
    private int year;
    private String month;
    private int day;

    public Date() {
        this(1900, "1월", 1);
    }

    public Date(int year) {// 생성자
        this(year, "19", 1);
    }

    public Date(int year, String month, int day) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "year=" + year +
                ", month='" + month + '\'' +
                ", day=" + day +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Date date1 = new Date(2023, "3월", 16);
        Date date2 = new Date(2028);
        Date date3 = new Date();
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
    }
}