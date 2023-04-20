package objectclass;

import java.util.Objects;

public class Car {

  protected String brand;
  protected String model;

  public Car() {
    this("Unknown", "Unknown");
  }

  public Car(String brand, String model) {
    this.brand = brand;
    this.model = model;
  }

  public String getBrand() {
    return brand;
  }

  public String getModel() {
    return model;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public boolean isSameProduct(Car car) {
    return this.brand.equals(car.brand) && this.model.equals(car.model);
  }

  // @Override
  // public boolean equals(Object obj) {
  // if (!(obj instanceof Car)) return false;

  // Car car = (Car) obj;
  //   return this.brand.equals(car.brand) && this.model.equals(car.model);
  // }

  @Override
  public boolean equals(Object obj) {
    // 1. 자기 자신과 비교 똑같은 객체를 참조하고 있는지 확인
    if (this == obj) return true;
    // 2. obj가 null인지 확인, this의 클래스(Car)와 obj의 클래스가 같은지 확인
    if (obj == null || !obj.getClass().isInstance(this)) return false;

    // 3. obj를 Car로 형변환
    Car car = (Car) obj;

    // 4. 필드값을 비교
    /* Objects.equals()는 null 세이프한 비교를 해준다. */
    return Objects.equals(brand, car.brand) && Objects.equals(model, car.model);
    /* 반면에 아래코드는 일반적인 비교 방법으로, car객체가 null일 경우 NullPotinerException이 발생할 수 있다. */
    // return this.brand.equals(car.brand) && this.model.equals(car.model);

    /*
     * 2번에서 obj가 null인지 확인하는 이유는, obj가 null일 경우, obj.getClass()를 호출하면 NullPointerException이 발생하기 때문이다.
     * 그리고, 2번에서 this.getClass()와 obj.getClass()가 같은지 확인하는 이유는,
     * obj가 Car의 인스턴스가 아닐 경우, Car로 형변환을 할 수 없기 때문이다. (Car 객체로 변환하지 못하는 객체일 경우 ClassCastException이 발생한다.)
     * 2번에서 처리했기 떄문에 4번에서 굳이 Objects로 비교하지 않아도 되지만, Objects를 사용하는 것이 좋다.
     * Objects.equals()는 null 세이프한 비교를 해준다. 인자값 중 하나가 null이면 null인 경우를 고려하여 false를 반환한다.
     * null 값을 검사하는 것이 권장되는 프로그래밍 습관이다.
     */
  }
}
