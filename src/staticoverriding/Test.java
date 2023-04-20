package staticoverriding;

public class Test {

  public static void main(String[] args) {
    // 호출할 메소드는 변수의 타입을 보고 결정하는 것이 아니라
    // 그 변수가 참조하는 객체가 무엇이냐를 기준을 결정한다.
    // => 동적 바인딩

    // animal과 cat은 같은 객체를 참조한다.
    Animal animal = new Cat(); // animal 타입은 Animal이다.
    Cat cat = (Cat) animal; // cat 타입은 Cat이다.

    // animal과 cat에 모두 sound() 메소드가 있는데, 호출할 메소드는 객체의 타입을 보고 결정한다.
    // animal은 Animal 타입이고, Animal 클래스에는 sound() 메소드가 있다.

    /* 동적 메소드의 Overriding */
    // 그래서 Animal 클래스의 sound() 메소드가 호출될 것처럼 보이지만, 해당 객체는 Cat 타입이다.
    animal.sound(); // 그래서 Cat 클래스의 sound() 메소드가 호출된다.
    cat.sound(); // Cat 클래스의 sound() 메소드가 호출된다.

    /* 정적 메소드의 Overriding (**imposible**) */
    // animal과 cat에 모두 eat() 메소드가 있는데, 정적 메소드는 overriding 할 수 없다.
    animal.eat(); // Animal 클래스의 eat() 메소드가 호출된다.
    cat.eat(); // Cat 클래스의 eat() 메소드가 호출된다.
  }
}
