package HW7;

public class RectangularTriangle extends Triangle{
    public RectangularTriangle(double side1, double side2, double side3){
        super(side1, side2, side3);
    }
    public double getTrianglePerimeter(){
        return trianglePerimeter();
    }
    public double rectangularTriangleArea(){
        return 0.5 * sideA * sideB;
    }

}
