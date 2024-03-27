package HW7;

public class Rectangle extends Quadrilateral{
    public Rectangle(double sideA, double sideB, double sideC, double sideD){
        super(sideA, sideB, sideC, sideD);

    }
    public double getQuadrilateralPerimeter(){
        return quadrilateralPerimeter();
    }
    public double RectangularArea(){
        return side1*side2;
    }
}
