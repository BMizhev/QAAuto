package HW2;

import java.util.Scanner;

public class hourRateCalc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the qty of working hours per week:");
        int hoursPerWeek = scanner.nextInt();


        System.out.println("Please enter your salary per year:");
        int yearSalaryWithTax = scanner.nextInt();

        System.out.println("Please enter your tax rate %:");
        int taxRate = scanner.nextInt();



        double ratePerHourWithTax = (yearSalaryWithTax / 12 / 4) / hoursPerWeek;
        double ratePerHourNoTax = ratePerHourWithTax - (ratePerHourWithTax * (taxRate/100));
        System.out.println("With " + hoursPerWeek + " hours per week, with year salary "+ yearSalaryWithTax + " and tax rate " + taxRate + "%" + " you rate per hour is " + ratePerHourNoTax + ".");
    }
}
