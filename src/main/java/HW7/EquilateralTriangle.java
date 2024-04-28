package HW7;
import static java.lang.Math.sqrt;

public class EquilateralTriangle extends Triangle{

  public EquilateralTriangle(double side){
      super(side, side, side);
  }
public double getTrianglePerimeter(){

      return trianglePerimeter();
    }
public double equilateralArea(){

      return ((sideA*sideA)* sqrt(3))/4;
    }
}