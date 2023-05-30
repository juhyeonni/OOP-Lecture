package anonymous;

public class PanasonicTV extends TV {

  @Override
  public void setChannel(int channel) {
    this.channel = channel;
  }

  @Override
  public void setVolume(int volume) {
    this.volume = volume;
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
