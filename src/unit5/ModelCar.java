class ModelCar {
    public static int id;
    private int numbers;

    private String model;
    private String color;

    static final int MAX_SPEED;

    private int speed;

    static {
        MAX_SPEED = 350;
        System.out.println("Initialized class variables ");
    }

    public ModelCar() {
        this.numbers = ++id;
    }

    public ModelCar(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "ModelCar{" +
                "numbers=" + numbers +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}


class Test {
    public static void main(String[] args) {
        ModelCar obj1 = new ModelCar();
        System.out.println(obj1);
        ModelCar obj2 = new ModelCar();
        System.out.println(obj2);
        ModelCar obj3 = new ModelCar();
        System.out.println(obj3);
    }
}