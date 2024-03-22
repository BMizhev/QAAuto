package HW4;

import java.util.Arrays;
import java.util.Comparator;

public class HW4_2 {
    public static void main(String[] args){
        Integer[] numbers = new Integer[args.length];
        for (int i = 0; i< args.length; i++){
            numbers[i] = Integer.parseInt(args[i]);
        }
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, Comparator.naturalOrder());
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers, Comparator.reverseOrder());
        System.out.println(Arrays.toString(numbers));

        Integer[] innerSorted = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            if (i%2 == 0){
                innerSorted[i/2] = numbers[i];
                continue;
            }
            innerSorted[numbers.length-1 - i/2] = numbers[i];
        }
        System.out.println(Arrays.toString(innerSorted));

    }
}
