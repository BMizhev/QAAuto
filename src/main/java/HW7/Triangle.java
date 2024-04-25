package HW7;

public class Triangle extends Figure{
   protected double sideA;
   protected double sideB;
   protected double sideC;

    public Triangle(){}

    public Triangle(double side1, double side2, double side3){
    sideA = side1;
    sideB = side2;
    sideC = side3;
    }
    public double trianglePerimeter(){
    return sideA+sideB+sideC;
     }
}
