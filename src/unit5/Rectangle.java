class Rectangle {
    private int x, y;
    private int width, height;

    Rectangle() {
        this(0, 0, 0, 1); // 생성자 호출
    }

    Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}

class Test {
    public static void main(String[] args) {
        
    }
}