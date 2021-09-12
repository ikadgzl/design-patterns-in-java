package Creational.AbstractFactory.Loan;

public abstract class Loan {
  protected double interestRate;

  abstract void getInterestRate(double interestRate);
  public void calculateLoanPayment() {
    System.out.println("Calculating loan payment...");
  }
}
