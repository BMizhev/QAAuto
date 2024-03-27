package HW7;

public class Rhombus extends Quadrilateral {
    public double height;
    public Rhombus(double sideA, double sideB, double sideC, double sideD, double height){
        super(sideA, sideB, sideC, sideD);
        this.height = height;
    }
    public double getQuadrilateralPerimeter(){
        return quadrilateralPerimeter();
    }
    public double rhombusArea(){
        return side1 * height;
    }
}
