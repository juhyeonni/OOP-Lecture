class Person {
    // Access modifier
    /*
    멤버변수는 특별한 이유가 없으면 private
    다른 클래스에서 접근이 가능하게 하면 예상하지 못한 상황이 생길 수 있기 때문이다.
    method로 해당 멤버 변수로 접근하게 하면 된다.

    public, protected, default, private 등이 있다.
    자세한 내용은 마크다운으로 첨부한다.
     */
    private String name;
    private int age;
    String dept= "wdj";

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        }

        else {
            System.out.println("나이의 범위는 0부터 150까지입니다.");
        }
    }

    public int getAge() {
        return age;
    }

    private void test() {
        System.out.println(name);
    }
}

class Test {
    public static void main(String[] args) {
        Person person0 = new Person();
        person0.setAge(20);
        String d = person0.dept;
        int age = person0.getAge();

        System.out.println(age);
        System.out.println(d);
    }
}