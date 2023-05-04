package interfaceclass;

public class Car implements Comparable {

  private String brand;
  private String model;
  private int speed;
  private int price;

  public Car() {
    this("Unknown", "Unknown", 0, 0);
  }

  public Car(String brand, String model, int speed, int price) {
    this.brand = brand;
    this.model = model;
    this.speed = speed;
    this.price = price;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public int getPrice() {
    return price;
  }

  public int getSpeed() {
    return speed;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public static Car findLarger(Comparable c1, Comparable c2) {
    if (c1.compareTo(c2) >= 0) {
      return (Car) c1;
    } else {
      return (Car) c2;
    }
  }

  @Override
  public String toString() {
    return String.format(
      "[브랜드: %s, 모델: %s, speed: %d, price: %d]",
      brand,
      model,
      speed,
      price
    );
  }

  @Override
  public int compareTo(Comparable obj) {
    if (!(obj instanceof Car)) {
      throw new ClassCastException(
        obj.getClass().getSimpleName() + " is not an instance of Car"
      );
    }

    Car c = (Car) obj;

    if (price > c.price) {
      return 1;
    } else if (price < c.price) {
      return -1;
    } else {
      return 0;
    }
  }
}
