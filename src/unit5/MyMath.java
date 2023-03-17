class MyMath {
    // 입력된 정수 값을 더해주는 메서드
    static int add(int argX, int argY) {
        return argX + argY;
    }

    // 입력한 값의 제곱을 반환해주는 메서드 - 오버로딩
    // 정수 값을 제곱하는 메서드
    static int square(int argInt) {
        return argInt * argInt;
    }

    // 실수 값을 제곱하는 메서드
    static double square(double argDouble) {
        return argDouble * argDouble;
    }
}

class Test {
    public static void main(String[] args) {
        int sum;  // 합계
        int squareInt;
        Double squareDouble;

        // 2 + 3 결과 출력
        sum = MyMath.add(2, 3);
        System.out.println("2와 3의 합은 " + sum);

        // 7 + 8 결과 출력
        sum = MyMath.add(7, 8);
        System.out.println("7과 8의 합은 " + sum);

        // 10의 제곱 결과 출력
        squareInt = MyMath.square(10);
        System.out.println("10의 제곱은 " + squareInt);

        // 3.14의 제곱 결과 출력
        squareDouble = MyMath.square(3.14);
        System.out.println("3.14의 제곱은 " + squareDouble);
    }
}