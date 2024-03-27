package HW7;

import static java.lang.Math.sqrt;

public class IsoscelesTriangle extends Triangle{

    public IsoscelesTriangle(double side1, double side2, double side3){
        super(side1, side2, side3);

    }
    public double getTrianglePerimeter(){
        return trianglePerimeter();
    }
    public double IsoscelesArea(){
        double s = (sideA + sideB + sideC) / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
