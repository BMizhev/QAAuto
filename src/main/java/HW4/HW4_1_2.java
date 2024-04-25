package HW4;

public class HW4_1_2 {
    public static void main(String[] args){
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

        for (int i=0; i<height; i++){
            for (int k=0; k<=i; k++){
                if (i == k){
                    break;
                    }

                System.out.print("*");
            }
            System.out.println();
        }}}

