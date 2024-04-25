package HW8;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;

import HW7.Quadrilateral;
import HW7.Rectangle;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Quadrilateral R1 = new Quadrilateral();
        Class<? extends Quadrilateral> aClass = R1.getClass();
        Annotation[] annotations1 = aClass.getAnnotations();
        System.out.println(Arrays.toString(annotations1));
        Field[] declaredFields = aClass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));

        for (Field field : declaredFields){
            field.setAccessible(true);
            System.out.println(field.getName() + ": " + field.get(R1));
        }

    }
}
