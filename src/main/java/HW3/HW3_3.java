package HW3;

import java.sql.SQLOutput;

public class HW3_3 {
    public static void main(String[] args){
        int monthNumber = Integer.parseInt(args[0]);
        double hourRate = Double.parseDouble(args[1]);
        double taxRate = Double.parseDouble(args[2]);
        int workingDays = 0;
        int workingHours;
        double salaryBeforeTax;
        double salaryAfterTax;

        switch(monthNumber){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                workingDays = 23;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                workingDays = 22;
                break;

            case 2:
                workingDays = 21;
                break;

            default:
                System.out.println("Invalid month number");
                return;
        }
        workingHours = workingDays*8;
        salaryBeforeTax = workingHours*hourRate;
        salaryAfterTax = workingHours*hourRate - (workingHours*hourRate*(taxRate/100));
        System.out.println("Salary before tax is: " + salaryBeforeTax);
        System.out.println("Salary after tax is: " + salaryAfterTax);
}}
