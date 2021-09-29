package Structural.Adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
  @Override
  public void playVlc(String fileName) {
    System.out.println("Playing from " + fileName);
  }

  @Override
  public void playMp4(String fileName) {
  }
}
