class OuterClass {
    class InnerClass {
        public void test() {
            System.out.println("hi");
        }
    }
}
class Test {
    public static void main(String[] args) {
        OuterClass obj1 = new OuterClass();

        OuterClass.InnerClass obj2 = obj1.new InnerClass();

        obj2.test();
    }
}