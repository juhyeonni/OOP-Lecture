package interfaceclass;

public class CarTest {

  public static void main(String[] args) {
    Car c1 = new Car("BMW", "X5", 300, 50000);
    Car c2 = new Car("BMW", "X5", 300, 50000);
    Car c3 = new Car();

    Student s1 = new Student("John", 20);
    Student s2 = new Student("John", 20);

    System.out.println(c1);
    System.out.println(c2);

    System.out.println(c3);

    System.out.println(Car.findLarger(c1, c3));
  }
}
