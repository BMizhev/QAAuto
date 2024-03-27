package HW7;

public class Parallelogram extends Quadrilateral {
    public double height;
    public Parallelogram(double sideA, double sideB, double sideC, double sideD, double height){
        super(sideA, sideB, sideC, sideD);
        this.height = height;

    }public double getQuadrilateralPerimeter(){
        return quadrilateralPerimeter();

    }public double parallelogramArea(){
        return side1*height;
    }
}
