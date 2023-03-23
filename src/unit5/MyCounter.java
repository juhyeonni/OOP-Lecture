class MyCounter {
    private int value;

    MyCounter(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    // 파라미터로 들어온 인스턴스(MyCounter 형식)의 value 값을 증가시킨다.
    public static void increase(MyCounter obj) {
        int value = obj.getValue() + 1;
        obj.setValue(value);
    }

    @Override
    public String toString() {
        return "MyCounter{" +
                "value=" + value +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        MyCounter obj1 = new MyCounter(100);
        System.out.println(obj1);

        // static 메소드를 사용하여 value 값 증가
        MyCounter.increase(obj1);

        System.out.println(obj1);
    }
}