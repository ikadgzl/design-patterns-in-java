package Creational.AbstractFactory.Loan;

public class EducationalLoan extends Loan {

  @Override
  void getInterestRate(double interestRate) {
    this.interestRate = interestRate;
  }
}
