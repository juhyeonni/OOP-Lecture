package anonymous;

public class SamsungTV extends TV {

  @Override
  public void setChannel(int channel) {
    System.out.println("SamsungTV change channel not implemented");
  }

  @Override
  public void setVolume(int volume) {
    System.out.println("SamsungTV change volume not implemented");
  }

  @Override
  public void turnOff() {
    this.power = false;
  }

  @Override
  public void turnOn() {
    this.power = true;
  }
}
