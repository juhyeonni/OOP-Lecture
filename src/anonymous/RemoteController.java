package anonymous;

import java.util.Scanner;

public class RemoteController {

  private static Scanner sc = new Scanner(System.in);

  public static void turnOn(RemoteTV tv) {
    tv.turnOn();
  }

  public static void turnOff(RemoteTV tv) {
    tv.turnOff();
  }

  public static void setVolume(RemoteTV tv) {
    System.out.print("Enter volume: ");
    int inputVolume = sc.nextInt();

    tv.setVolume(inputVolume);
  }

  public static void setChannel(RemoteTV tv) {
    System.out.print("Enter Channel: ");
    int inputChannel = sc.nextInt();

    tv.setChannel(inputChannel);
  }
}
