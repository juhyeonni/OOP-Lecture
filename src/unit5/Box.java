class Box {
    private int width;
    private int height;
    private int length;
    private boolean[] isSet = new boolean[3];

    Box () {
        System.out.println("값을 설정하십시오.");
    }
    Box (int argWidth) {
        this.width = argWidth;
        this.isSet[0] = true;
    }
    Box (int argWidth, int argHeight) {
        this(argWidth);
        this.height = argHeight;
        this.isSet[1] = true;
    }
    Box (int argWidth, int argHeight, int argLength) {
        this(argWidth, argHeight);
        this.length = argLength;
        this.isSet[2] = true;
    }

    public int getVolume() {
      return width*height*length;
    }

    public static Box whoIsLargerBox(Box obj1, Box obj2) {
      Box larger = (obj1.getVolume() > obj2.getVolume()) ? obj1 : obj2;

      return larger;
    }

    public void setWidth(int argWidth) {
        this.width = argWidth;
        this.isSet[0] = true;
    }

    public void setHeight(int argHeight) {
        this.height = argHeight;
        this.isSet[1] = true;
    }

    public void setLength(int argLength) {
        this.length = argLength;
        this.isSet[2] = true;
    }

    public void prtInfo() {
        String msg = "";

        if (isSet[0] && isSet[1] && isSet[2]) {
            msg = String.format("""
                            상자의 가로: %d
                            상자의 세로: %d
                            상자의 높이: %d
                            입니다.""",
                    this.width, this.length, this.height
            );
        } else {
            if (isSet[0] == false) msg += "가로 ";
            if (isSet[1] == false) msg += "높이 ";
            if (isSet[2] == false) msg += "세로 ";
            msg += "값이 설정되어 있지 않습니다. set 메소드를 사용하여, 값을 할당하세요.";
        }

        System.out.println(msg);
    }
}

class Test {
    public static void main(String[] args) {
        // // 아무 데이터가 없는 객체
        // Box obj1 = new Box();
        // obj1.prtInfo();
        // System.out.println();


        // // 모든 데이터가 있는 객체
        // Box obj2 = new Box(1, 1, 2);
        // obj2.prtInfo();
        // System.out.println();


        // // 모든 데이터가 없지만, 하나하나 대입하는 객체
        // Box obj3 = new Box();
        // obj3.prtInfo();
        // System.out.println();

        // obj3.setWidth(2);       // 가로 값 입력
        // obj3.prtInfo();
        // System.out.println();

        // obj3.setHeight(3);      // 높이 값 입력
        // obj3.prtInfo();
        // System.out.println();

        // obj3.setLength(4);      // 세로 값 입력
        // obj3.prtInfo();
        // System.out.println();

        // System.out.println(obj3.getVolume());
        Box obj1 = new Box(10 , 10, 10);
        Box obj2 = new Box(10, 10, 11);

        Box larger = Box.whoIsLargerBox(obj1, obj2);
        larger.prtInfo();
    }
}