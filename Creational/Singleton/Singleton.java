package Creational.Singleton;

public class Singleton {
  private static final Singleton singletonInstance = new Singleton();

  private Singleton() {
  }

  public static Singleton getInstance() {
    return singletonInstance;
  }

  public void message() {
    System.out.println("From Singleton class, Singleton::message");
  }
}
