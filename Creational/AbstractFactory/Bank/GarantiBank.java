package Creational.AbstractFactory.Bank;

public class GarantiBank implements Bank {
  private final String name = "Garanti BBVA";

  @Override
  public String getBankName() {
    return name;
  }
}
