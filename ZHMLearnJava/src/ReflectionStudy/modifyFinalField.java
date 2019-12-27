package ReflectionStudy;

import java.lang.reflect.Field;

public class modifyFinalField {
    public static void main(String[] args) throws Exception {
        FinalFieldClass finalFieldClass = new FinalFieldClass();
        Class fClass = finalFieldClass.getClass();

        System.out.println("Class name is " + fClass.getName());

        Field field = fClass.getDeclaredField("FINAL");

        field.setAccessible(true);

        System.out.println("Before modification is " + field.get(finalFieldClass));

        field.set(finalFieldClass, "MODIFIED");
        /*
        Here and before, for the `get`,`set` and `invoke` methods, parameter inside the branket is
         */
        System.out.println("After modification is " + field.get(finalFieldClass));

        System.out.println("Actual value is " + finalFieldClass.getFINAL());
    }


}
