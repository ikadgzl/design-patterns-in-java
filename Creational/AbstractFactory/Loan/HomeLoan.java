package Creational.AbstractFactory.Loan;

public class HomeLoan extends Loan {

  @Override
  void getInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }
}
