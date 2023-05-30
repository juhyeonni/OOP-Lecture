package anonymous;

public class TVTest {

  public static void main(String[] args) {
    // panasonic tv
    TV panasonic = new PanasonicTV();
    System.out.println(panasonic);

    RemoteController.turnOn(panasonic);
    System.out.println(panasonic);

    RemoteController.setChannel(panasonic);
    System.out.println(panasonic);

    RemoteController.setVolume(panasonic);
    System.out.println(panasonic);

    // samsung tv
    TV samsung = new SamsungTV();
    System.out.println(samsung);

    RemoteController.turnOn(samsung);
    System.out.println(samsung);

    RemoteController.setChannel(samsung);
    System.out.println(samsung);

    RemoteController.setVolume(samsung);
    System.out.println(samsung);
  }
}
