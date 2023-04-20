package staticoverriding;

public class Cat extends Animal {

  public static void eat() {
    System.out.println("고양이가 밥 먹는다.");
  }

  @Override
  public void sound() {
    System.out.println("Meow Meow");
  }
}
