package Creational.AbstractFactory.Bank;

public class YapiKrediBank implements Bank {
  private final String name = "Yapi Kredi Bankasi";

  @Override
  public String getBankName() {
    return name;
  }
}
