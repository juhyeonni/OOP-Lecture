package objectclass;

public class CarTest {

  public static void main(String[] args) {
    Car obj = new Car();
    Class classVar = obj.getClass();
    System.out.println(classVar.getName());

    System.out.println(
      String.format("브랜드: %s, 모델: %s", obj.getBrand(), obj.getModel())
    );

    Car obj1 = new Car("현대", "소나타");
    Car obj2 = new Car("현대", "소나타");
    Car obj3 = obj1;
    Car obj4 = new Car("기아", "K7");

    // obj1과 obj3는 같은 객체이다.
    // obj1과 obj2는 같은 내용을 가지고 있지만, 다른 객체이다.
    // obj1과 obj3는 같은 객체를 참조하고 있기 때문에 true를 반환한다.
    /*
    System.out.println(obj1.equals(obj2)); // false
    System.out.println(obj1.equals(obj3)); // true
    */
    System.out.println(obj1.isSameProduct(obj2));
    System.out.println(obj1.isSameProduct(obj3));
    System.out.println(obj1.isSameProduct(obj4));

    Car obj5 = new Car("현대", "소나타");
    SportsCar obj6 = new SportsCar("현대", "소나타");
    Car obj7 = new SportsCar("현대", "소나타");

    System.out.println(obj5.isSameProduct(obj6));
    System.out.println(obj5.isSameProduct(obj7));
  }
}
