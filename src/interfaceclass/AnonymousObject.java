package interfaceclass;

class Student {

  String id;
  String name;
  int grade;

  Student() {
    this("", "", 0);
  }

  Student(String id, String name, int grade) {
    this.id = id;
    this.name = name;
    this.grade = grade;
  }

  public void print() {
    System.out.println(
      "Student " + id + " (" + name + ") is in grade " + grade
    );
  }
}

public class AnonymousObject {

  public static void main(String[] args) {
    Student std1 = new Student("001", "John", 1);
    Student std2 = new Student() {
      @Override
      public void print() {
        System.out.println(
          "Student " +
          id +
          " (" +
          name +
          ") is in grade " +
          grade +
          " and she is instance by anonymous class"
        );
      }
    };

    std1.print();
    std2.print();
  }
}
