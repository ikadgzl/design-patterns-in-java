package Creational.Factory;

public class ShapeFactory {
  public Shape getShape(String shapeType) {
    switch (shapeType) {
      case "CIRCLE":
        return new Circle();
      case "SQUARE":
        return new Square();
      case "RECTANGLE":
        return new Rectangle();
      default:
        System.out.println("No match");
        return null;
    }
  }
}
