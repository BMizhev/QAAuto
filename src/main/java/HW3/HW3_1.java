package HW3;

import java.util.Scanner;

public class HW3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = scanner.nextInt();

        int evenNumber = number%2;
        if (evenNumber == 0){
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        if (number > 0){
            System.out.println("The number is positive.");
        } else if (number == 0) {
            System.out.println("The number is zero.");
        } else {
            System.out.println("The number is negative.");
        }

        boolean isItPrime = true;
        if (number <= 1) {
            isItPrime = false;
            System.out.println("The number is neither prime nor composite.");
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isItPrime = false;
                    System.out.println("The number is composite.");
                    break;}
            }}
        if (isItPrime) {
            System.out.println("The number is prime.");
        }
    }}
