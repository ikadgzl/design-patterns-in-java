package Creational.AbstractFactory.Loan;

public class BusinessLoan extends Loan {

  @Override
  void getInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }
}
