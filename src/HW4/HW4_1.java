package HW4;

import java.util.Scanner;

public class HW4_1 {
    public static void main(String[] args) {
        int height = 0;
        int width = 0;
        printSquare(height, width);
        rightTriangleLefty(height);
        rightTriangleRighty(height);
        printPyramid(height);
        Scanner scanner = new Scanner(System.in);
        boolean getAnother = true;

        while (getAnother) {
            System.out.println("What figure you want to draw?");
            String figureType = scanner.next();

            if (figureType.equalsIgnoreCase("Square")) {
                System.out.println("Please enter a height value:");
                height = scanner.nextInt();
                System.out.println("Please enter a width value:");
                width = scanner.nextInt();
                printSquare(height, width);
            } else if (figureType.equalsIgnoreCase("right triangle lefty")) {
                System.out.println("Please enter a height value:");
                height = scanner.nextInt();
                rightTriangleLefty(height);
            } else if (figureType.equalsIgnoreCase("right triangle righty")) {
                System.out.println("Please enter a height value:");
                height = scanner.nextInt();
                rightTriangleRighty(height);
            } else if (figureType.equalsIgnoreCase("pyramid")) {
                System.out.println("Please enter a height value:");
                height = scanner.nextInt();
                printPyramid(height);
            } else {
                System.out.println("Invalid Figure. Please enter one of these options: Square; Right Triangle Lefty; right triangle righty; pyramid.");
            }
            System.out.println("Do you want to get another figure? (yes/no)");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                getAnother = false;
            }
        }}
    public static void printSquare(int height, int width) {
     for (int i=0; i<height; i++){
        for (int k=0; k<width; k++){
            System.out.print("*");
        }
        System.out.println();
    }}

    public static void rightTriangleLefty(int height){
               for (int i=0; i<height; i++){
            for (int k=0; k<=i; k++){
                if (i == k){
                    break;
                }
                System.out.print("*");
            }System.out.println();
        }}

    public static void rightTriangleRighty(int height){
        for (int i=0; i<height; i++){
            for (int j = height - 1; j>i; j--){
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }}

    public static void printPyramid(int height){
        for (int i=0; i<height; i++){
            for (int j = 0; j<height-i-1; j++){
                System.out.print(" ");
            }
            for (int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }}}
