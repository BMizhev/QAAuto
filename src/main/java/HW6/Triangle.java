package HW6;
import static java.lang.Math.sqrt;

public class Triangle {
    private double sideLength;

    public Triangle(double lengthOfOneSide){
        sideLength = lengthOfOneSide;
    }
//getter
    public double getSideLengthP(){
        return sideLength;
    }
//setter
    public void setSideLength(double triangleSideLength){
        sideLength = triangleSideLength;
    }
   //formula methods.
    public double trianglePerimeter(double sideLength){
           return sideLength*3;
}
    public double triangleAreaCalc(double sideLength){
        return ((sideLength*sideLength)* sqrt(3))/4;
    }
}
