package HW7;

public class Trapezoid extends Quadrilateral {
    public double height;
    public Trapezoid(double sideA, double sideB, double sideC, double sideD, double height){
        super(sideA, sideB, sideC, sideD);
        this.height = height;
    }
    public double getQuadrilateralPerimeter(){
        return quadrilateralPerimeter();
    }
    public double trapezoidArea(){
        return 0.5 * (side1 + side2) * height;
    }
}
