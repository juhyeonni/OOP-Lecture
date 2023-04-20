package staticoverriding;

public class Animal {

  // 모든 Animal 클래스의 인스턴스를 공유하는 정적 메소드
  public static void eat() {
    System.out.println("동물이 밥 먹는다.");
  }

  public void sound() {
    System.out.println("Sounds of Animal");
  }
}
