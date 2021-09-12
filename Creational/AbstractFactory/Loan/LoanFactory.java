package Creational.AbstractFactory.Loan;

import Creational.AbstractFactory.AbstractFactory;
import Creational.AbstractFactory.Bank.Bank;

public class LoanFactory extends AbstractFactory {
  @Override
  public Bank getBank(String bankName) {
    return null;
  }

  @Override
  public Loan getLoan(String loanType) {
    return switch (loanType) {
      case "Business" -> new BusinessLoan();
      case "Home" -> new HomeLoan();
      case "Educational" -> new EducationalLoan();
      default -> null;
    };
  }
}
