package Creational.AbstractFactory;

import Creational.AbstractFactory.Bank.Bank;
import Creational.AbstractFactory.Loan.Loan;

public abstract class AbstractFactory {
  public abstract Bank getBank(String bankName);
  public abstract Loan getLoan(String loanType);
}
