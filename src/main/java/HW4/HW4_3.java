package HW4;

import java.util.Scanner;

public class HW4_3 {
    public static void main(String[] args){
        double loan;
        double taxLoan;

        double qtyMonthPayments;
        double  monthPaymentAmount;
        Scanner scanner = new Scanner(System.in);
        boolean anotherOption = true;
        boolean paymentOrNot = true;

        System.out.println("Please enter the full loan amount:");
        loan = scanner.nextDouble();

        System.out.println("Please enter the tax rate:");
        taxLoan = scanner.nextDouble();

        while (anotherOption) {

            System.out.println("Please select an option:");
            System.out.println("Option '1': Calculate the quantity of monthly payments to repay the loan");
            System.out.println("Option '2': Calculate a monthly payment sum");
            int questionType = scanner.nextInt();

            if (questionType == 1) {
                System.out.println("Please enter the amount of monthly payment");
                monthPaymentAmount = scanner.nextDouble();
                qtyMonthPayments = loan / (monthPaymentAmount + (taxLoan / 100));
                System.out.println("The qty of payments is: " + qtyMonthPayments);
                

            } else if (questionType == 2) {
                System.out.println("Please enter the desired quantity of payments:");
                qtyMonthPayments = scanner.nextDouble();
                monthPaymentAmount = (loan + (loan * (taxLoan / 100))) / qtyMonthPayments;
                System.out.println("The month payment is: " + monthPaymentAmount);

            } else
                System.out.println("You've entered incorrect option number");

            System.out.println("Do you want to select another option (yes/no)");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                anotherOption = false;
            }
        }}}
