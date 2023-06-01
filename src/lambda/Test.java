package lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    List<Person> persons = new ArrayList<Person>();

    Person p1 = new Person(
      "John",
      LocalDate.parse("2001-01-01"),
      "person1@test",
      Sex.MALE
    );

    Person p2 = new Person(
      "Jane",
      LocalDate.parse("2003-01-01"),
      "person2@test",
      Sex.FEMALE
    );

    Person p3 = new Person(
      "Moon",
      LocalDate.parse("1998-01-01"),
      "person3@test",
      Sex.MALE
    );

    // List에 사람 추가
    persons.add(p1);
    persons.add(p2);
    persons.add(p3);

    // List에 있는 사람들 중 나이가 21살 이상인 사람들의 이름을 출력
    System.out.println("21살 이상인 사람들의 이름:");
    printPersonOlderThan(persons, 21);

    // List에 있는 사람들 중 나이가 20살 이상인 사람들의 이름을 출력
    System.out.println("20살 이상인 사람들의 이름:");
    printPersonOlderThan(persons, 20);

    // List에 있는 사람들 중 나이가 21살 이상 23살 미만인 사람들의 이름을 출력
    System.out.println("21살 이상 23살 미만인 사람들의 이름:");
    printPersonsWithinAgeRange(persons, 21, 23);

    // List에 있는 사람들 중 나이가 19살 이상 23살 미만인 사람들의 이름을 출력
    System.out.println("19살 이상 23살 미만인 사람들의 이름:");
    printPersonsWithinAgeRange(persons, 19, 23);
  }

  // collection framework: List, Set, Map, Stack, Queue, ...etc
  // 이 자료구조에 들어갈 수 있는 원소 타입을 자바의 generic 이라는 기능을 이용해 지정할 수 있다.
  // List<Person>, Set<Integer>, Map<String, Integer>, ...etc

  public static void printPersonOlderThan(List<Person> persons, int age) {
    for (Person person : persons) {
      if (person.getAge() >= age) {
        person.printPerson();
      }
    }
  }

  public static void printPersonsWithinAgeRange(
    List<Person> persons,
    int low,
    int high
  ) {
    for (Person person : persons) {
      if (low <= person.getAge() && person.getAge() < high) {
        person.printPerson();
      }
    }
  }
}
