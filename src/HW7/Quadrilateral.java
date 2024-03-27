package HW7;

public class Quadrilateral extends Figure{
    protected double side1;
    protected double side2;
    protected double side3;
    protected double side4;

    public Quadrilateral(){}

    public Quadrilateral(double sideA, double sideB, double sideC, double sideD){
        side1 = sideA;
        side2 = sideB;
        side3 = sideC;
        side4 = sideD;
    }
    public double quadrilateralPerimeter(){
        return side1+side2+side3+side4;
    }

}
