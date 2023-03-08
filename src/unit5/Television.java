class Television {
    private int channel;
    private int volume;
    private boolean isOn;

    // 멤버 변수 setter
    public void setChannel(int argChannel) { this.channel = argChannel; }
    public void setVolume(int argVolume) { this.volume = argVolume; }
    public void setIsOn(boolean argIsOn) { this.isOn = argIsOn; }

    // Television의 멤버변수의 값 확인
    @Override
    public String toString() {
        return "Television{" +
                "channel=" + channel +
                ", volume=" + volume +
                ", isOn=" + isOn +
                '}';
    }

    // channel 값 가져오기
    public int getChannel() {
        return channel;
    }

    // volume 값 가져오기
    public int getVolume() {
        return volume;
    }

    // isOn 값 가져오기
    public boolean isOn() {
        return isOn;
    }
}

class Test {
    public static void main(String[] args) {
        Television obj = new Television();
        System.out.println(obj);

        obj.setIsOn(true);          // tv 켜기
        System.out.println(obj);
        obj.setChannel(10);         // channel 설정하기
        System.out.println(obj);
        obj.setVolume(100);         // volume 설정하기
        System.out.println(obj);
    }
}