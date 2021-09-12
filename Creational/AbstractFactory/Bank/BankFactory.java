package Creational.AbstractFactory.Bank;

import Creational.AbstractFactory.AbstractFactory;
import Creational.AbstractFactory.Loan.Loan;

public class BankFactory extends AbstractFactory {

  @Override
  public Bank getBank(String bankName) {
    return switch (bankName) {
      case "Ziraat" -> new ZiraatBank();
      case "Garanti" -> new GarantiBank();
      case "Yapi Kredi" -> new YapiKrediBank();
      default -> null;
    };
  }

  @Override
  public Loan getLoan(String loanType) {
    return null;
  }
}
