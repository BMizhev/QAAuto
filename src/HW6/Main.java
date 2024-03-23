package HW6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double triangleSide;
        double singlePayment;
       Product product1 = new Product("Coca-Cola", 123456, 2.5, true);


//getters-setters HW6_1
       System.out.println(product1.getName());
       System.out.println(product1.isAvailable());
        System.out.println(product1.getPrice());
        product1.setPrice(9.7);
        System.out.println(product1.getPrice());
        product1.setName("Coke Light");
        System.out.println(product1.getName());

        //getters-setters HW6_2
    Employee user1 = new Employee("Tony", "Sanches", "owner", 15);
        System.out.println(user1.getFirstName());
        System.out.println(user1.getLastName());
        System.out.println(user1.getRole());
        System.out.println(user1.getRate());
        user1.setFirstName("Anthony");
        user1.setLastName("Vasquez");
        user1.setRole("manager");
        user1.setRate(8);
        System.out.println(user1.getFirstName());
        System.out.println(user1.getLastName());
        System.out.println(user1.getRole());
        System.out.println(user1.getRate());

 //HW6_3
        System.out.println("Please enter the length of the side of your right triangle:");
        triangleSide = scanner.nextDouble();
        Triangle T1 = new Triangle(triangleSide);
        System.out.println("Perimeter of your right triangle is: "+T1.trianglePerimeter(triangleSide));
        System.out.println("Perimeter of your right triangle is: "+T1.triangleAreaCalc(triangleSide));

    //HW6_4
        Credit credit1 = new Credit(10000, 5, 1000);
        System.out.println("You credit full amount is " + credit1.getFullAmount());
        System.out.println("You month payment must be " + credit1.getMonthPayment());
        System.out.println("If you want to change the month single payment, please enter a new amount:");
        singlePayment = scanner.nextDouble();
        credit1.setMonthPayment(singlePayment);
        System.out.println("You new single payment is:" + credit1.getMonthPayment());





    }
}
