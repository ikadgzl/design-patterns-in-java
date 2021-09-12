package Creational.AbstractFactory.Bank;

public class ZiraatBank implements Bank{
  private final String name = "Ziraat Bankasi";

  @Override
  public String getBankName() {
    return name;
  }
}
