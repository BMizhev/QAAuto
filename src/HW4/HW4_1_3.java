package HW4;

public class HW4_1_3 {
    public static void main(String[] args){
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i=0; i<height; i++){
            for (int j = height - 1; j>i; j--){
                System.out.print(" ");
            }
            for (int k=0; k<=i; k++){



                System.out.print("*");
            }
            System.out.println();
        }}}
