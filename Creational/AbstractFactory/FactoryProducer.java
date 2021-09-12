package Creational.AbstractFactory;

import Creational.AbstractFactory.Bank.BankFactory;
import Creational.AbstractFactory.Loan.LoanFactory;

public class FactoryProducer {

  public static AbstractFactory getFactory(String factoryType) {
    return switch (factoryType) {
      case "Bank" -> new BankFactory();
      case "Loan" -> new LoanFactory();
      default -> null;
    };
  }
}
