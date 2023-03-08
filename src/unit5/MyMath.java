class MyMath {
    static int add(int ... argValue) {
        int result = 0;
        for (int value: argValue) {
            result += value;
        }

        return result;
    }
}

class Test {
    public static void main(String[] args) {
        int total = MyMath.add(1, 2, 3, 4, 5);
        System.out.println(total);
    }
}