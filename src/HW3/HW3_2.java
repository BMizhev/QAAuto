package HW3;

import java.util.Scanner;

public class HW3_2 {
    public static void main(String[] args){
        double costPerUnit = Double.parseDouble(args[0]);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter qty of items you want to purchase:");
        int itemQty = scanner.nextInt();

        if(itemQty > 80) {
            costPerUnit = costPerUnit - (costPerUnit * 0.13);
        }
        else if (itemQty > 70){
            costPerUnit = costPerUnit - (costPerUnit * 0.136);
        }
        else if (itemQty > 60){
            costPerUnit = costPerUnit - (costPerUnit * 0.132);
        }
        else if (itemQty > 50){
            costPerUnit = costPerUnit - (costPerUnit * 0.128);
        }
        else if (itemQty > 40){
            costPerUnit = costPerUnit - (costPerUnit * 0.124);
        }
        else if (itemQty > 30){
            costPerUnit = costPerUnit - (costPerUnit * 0.12);
        }
        else if (itemQty > 20){
            costPerUnit = costPerUnit - (costPerUnit * 0.10);
        }
        else if (itemQty > 10){
        costPerUnit = costPerUnit - (costPerUnit * 0.05);
        }
        System.out.println("Total amount is: " + (costPerUnit*itemQty));
    }}

