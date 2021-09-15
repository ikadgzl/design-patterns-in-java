package Creational.Builder;

public class Computer {
  private String HDD;
  private String RAM;

  private boolean isGraphicsCardEnabled;
  private boolean isBluetoothCardEnabled;

  private Computer(ComputerBuilder computerBuilder) {
    this.HDD = computerBuilder.HDD;
    this.RAM = computerBuilder.RAM;
    this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
    this.isBluetoothCardEnabled = computerBuilder.isBluetoothCardEnabled;
  }

  public String getHDD() {
    return HDD;
  }

  public String getRAM() {
    return RAM;
  }

  public boolean isGraphicsCardEnabled() {
    return isGraphicsCardEnabled;
  }

  public boolean isBluetoothCardEnabled() {
    return isBluetoothCardEnabled;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "HDD='" + HDD + '\'' +
        ", RAM='" + RAM + '\'' +
        ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
        ", isBluetoothCardEnabled=" + isBluetoothCardEnabled +
        '}';
  }

  public static class ComputerBuilder {
    private String HDD;
    private String RAM;

    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothCardEnabled;

    public ComputerBuilder(String HDD, String RAM) {
      this.HDD = HDD;
      this.RAM = RAM;
    }

    public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
      isGraphicsCardEnabled = graphicsCardEnabled;
      return this;
    }

    public ComputerBuilder setBluetoothCardEnabled(boolean bluetoothCardEnabled) {
      isBluetoothCardEnabled = bluetoothCardEnabled;
      return this;

    }

    public Computer build() {
      return new Computer(this);
    }
  }
}
