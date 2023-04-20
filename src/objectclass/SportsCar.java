package objectclass;

public class SportsCar extends Car {

  public SportsCar() {
    this("Unknown", "Unknown");
  }

  public SportsCar(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }
}
