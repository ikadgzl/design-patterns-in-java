package Creational.Prototype;

public class Employee implements Prototype {
  private String name;
  private String employeeType;
  private String department;

  public Employee(String name, String employeeType, String department) {
    this.name = name;
    this.employeeType = employeeType;
    this.department = department;
  }

  public void showEmployeeRecord() {
    System.out.println("Employee{" +
        "name='" + name + '\'' +
        ", employeeType='" + employeeType + '\'' +
        ", department='" + department + '\'' +
        '}');
  }

  @Override
  public Prototype getClone() {
    return new Employee(name, employeeType, department);
  }
}
