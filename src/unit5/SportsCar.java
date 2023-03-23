class Car {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void prtInfo() {
        System.out.println("현재 속도: " + this.speed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                '}';
    }
}

class SportsCar extends Car {
    private boolean turbo;

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "SportsCar{" + "\n" +
                "turbo=" + turbo + "\n" +
                "speed=" + getSpeed() + "\n" +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        SportsCar sc1 = new SportsCar();
        System.out.println(sc1.getSpeed());
        System.out.println(sc1);

    }
}