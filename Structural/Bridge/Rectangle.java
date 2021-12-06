package Structural.Bridge;

public class Rectangle extends Shape{
  public Rectangle(Color color) {
    super(color);
  }

  @Override
  public String draw() {
    return "Square drawn, color is " + color.paint();
  }
}
