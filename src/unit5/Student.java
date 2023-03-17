class Student {
    private int number;
    private String name;
    private int age;

    Student() {
        number = 100;
        name = "New Student";
        age = 18;
    }

    Student(int number, String name, int age) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        Student obj1 = new Student();
        System.out.println(obj1);

        Student obj2 = new Student(111, "Kim", 25);
        System.out.println(obj2);
    }
}