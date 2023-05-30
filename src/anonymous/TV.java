package anonymous;

public abstract class TV implements RemoteTV {

  protected static final int MAX_VOLUME = 100;
  protected boolean power;
  protected String name;
  protected int channel;
  protected int volume;

  public TV() {
    this("unknown", 0, 0);
  }

  public TV(String name, int channel, int volume) {
    this.name = name;
    this.channel = channel;
    this.volume = volume;
  }

  @Override
  public String toString() {
    return (
      this.getClass().getSimpleName() +
      " [power=" +
      power +
      ", name=" +
      name +
      ", channel=" +
      channel +
      ", volume=" +
      volume +
      "]"
    );
  }
}
