class Car {
    private int SPEED_LIMIT = 10;
    private int MAX_SPEED = 80;

    private String color = "white";   // 차 색상
    private int speed;      // 현재 속도
    private int gear = 1;       // 현재 기어

    Car() {}
    Car(String argColor) {
        this.color = argColor;
    }

    public void speedUp() {
        if (speed >= MAX_SPEED) {
            System.out.println("최고 속도입니다.");
            return;
        }
        speed++;
        updateGear();
    }

    public void speedDown() {
        if (speed <= 0) {
            System.out.println("정지합니다.");
            return;
        }
        speed--;
        updateGear();
    }

    private void updateGear() {
        int maximumSpeed = gear * SPEED_LIMIT;
        int minimumSpeed = (gear-1) * SPEED_LIMIT;

        if (speed > maximumSpeed) {
            this.gear++;
            System.out.println("기어 변경 (높임)");
        }
        if (speed < minimumSpeed) {
            this.gear--;
            System.out.println("기어 변경 (낮춤)");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                ", gear=" + gear +
                "}";
    }
}

class Test {
    public static void main(String[] args) {
        // 최저 속도 확인
        Car obj1 = new Car();

        System.out.println(obj1);
        obj1.speedDown();
        obj1.speedDown();
        obj1.speedDown();
        System.out.println(obj1);

        System.out.println();

        // 최고 속도 확인
        Car obj2 = new Car();

        System.out.println(obj2);
        for (int i = 0; i < 80; i++) {
            obj2.speedUp();
        }
        System.out.println(obj2);
    }
}