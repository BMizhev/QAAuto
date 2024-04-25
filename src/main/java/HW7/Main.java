package HW7;
import java. lang. Math. *;

public class Main {
    public static void main(String[] args) {
//Circle
      Circle Circle1 = new Circle(5);
      double circleLength = 2 * Math.PI * Circle1.getRadius();
      System.out.println("Your circle with the added radius has length " + circleLength);

//equalteralTriangle
        EquilateralTriangle Triangle1 = new EquilateralTriangle(5);
        System.out.println("Your Equilateral Triangle has perimeter " + Triangle1.trianglePerimeter());
        System.out.println("Your Equilateral Triangle has Area " + Triangle1.equilateralArea());

// IsoscelesTriangle
        IsoscelesTriangle Triangle2 = new IsoscelesTriangle(5, 5, 2);
        System.out.println("Your Isosceles Triangle has perimeter " + Triangle2.trianglePerimeter());
        System.out.println("Your Isosceles Triangle has Area " + Triangle2.IsoscelesArea());

//Rectangular Triangle
        RectangularTriangle Triangle3 = new RectangularTriangle(5, 5, 7);
        System.out.println("Your Rectangular Triangle has perimeter " + Triangle3.trianglePerimeter());
        System.out.println("Your Rectangular Triangle has Area " + Triangle3.rectangularTriangleArea());

// Rectangle
        Rectangle Figure1 = new Rectangle(4, 2, 4, 2);
        System.out.println("Your Rectangle has perimeter " + Figure1.quadrilateralPerimeter());
        System.out.println("Your Rectangle has Area " + Figure1.RectangularArea());

// Parallelogram
        Parallelogram Figure2 = new Parallelogram(4, 2, 4, 2, 2);
        System.out.println("Your Parallelogram has perimeter " + Figure2.quadrilateralPerimeter());
        System.out.println("Your Parallelogram has Area " + Figure2.parallelogramArea());

//Square
        Square Figure3 = new Square(4, 4, 4, 4);
        System.out.println("Your Square has perimeter " + Figure3.quadrilateralPerimeter());
        System.out.println("Your Square has Area " + Figure3.squareArea());

// Trapezoid
        Trapezoid Figure4 = new Trapezoid(3, 2, 4, 2, 2);
        System.out.println("Your Trapezoid has perimeter " + Figure4.quadrilateralPerimeter());
        System.out.println("Your Trapezoid has Area " + Figure4.trapezoidArea());

// Rhombus
        Rhombus Figure5 = new Rhombus(4, 4, 4, 4, 5);
        System.out.println("Your Rhombus has perimeter " + Figure4.quadrilateralPerimeter());
        System.out.println("Your Rhombus has Area " + Figure5.rhombusArea());

    }
}
