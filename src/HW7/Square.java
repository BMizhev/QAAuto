package HW7;

public class Square extends Quadrilateral {
    public Square(double sideA, double sideB, double sideC, double sideD){
        super(sideA, sideB, sideC, sideD);

    }
    public double getQuadrilateralPerimeter(){
        return quadrilateralPerimeter();
    }
    public double squareArea(){
        return side1*side2;
    }
}
