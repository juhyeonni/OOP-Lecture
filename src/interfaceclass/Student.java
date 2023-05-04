package interfaceclass;

public class Student implements Comparable {

  static int seq = 0;
  private String name;
  private String dept;
  private String stdNum;

  public Student() {
    this("Unknown", "Unknown");
  }

  public Student(String name, String dept) {
    this.name = name;
    this.dept = dept;
    this.stdNum = ++seq + "";
  }

  public String getName() {
    return name;
  }

  public String getDept() {
    return dept;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  @Override
  public String toString() {
    return "[이름: " + name + ", 학과: " + dept + ", 학번: " + stdNum + "]";
  }

  @Override
  public int compareTo(Comparable obj) {
    Student std = (Student) obj;

    return stdNum.compareTo(std.name);
  }
}
