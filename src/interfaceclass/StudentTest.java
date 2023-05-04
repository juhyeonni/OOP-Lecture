package interfaceclass;

public class StudentTest {

  public static void main(String[] args) {
    Comparable[] stds = new Student[5];
    Student s1 = new Student("John", "A");
    Student s2 = new Student("John", "B");
    Student s3 = new Student("david", "A");
    Student s4 = new Student("John", "C");
    Student s5 = new Student("Chris", "C");
    stds[0] = s1;
    stds[1] = s2;
    stds[2] = s3;
    stds[3] = s4;
    stds[4] = s5;

    polymorphism.Util.selectionSort(stds);

    for (Comparable s : stds) {
      System.out.println(s);
    }
  }
}
