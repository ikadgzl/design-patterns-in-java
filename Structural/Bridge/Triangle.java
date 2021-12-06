package Structural.Bridge;

public class Triangle extends Shape{
  public Triangle(Color color) {
    super(color);
  }

  @Override
  public String draw() {
    return "Triangle drawn, color is" + color.paint();
  }
}
