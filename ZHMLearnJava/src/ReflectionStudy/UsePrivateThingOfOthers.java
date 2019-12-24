package ReflectionStudy;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UsePrivateThingOfOthers {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        /*
        Get class object
         */
        PrivateClass privateClass = new PrivateClass();
        Class pClass = privateClass.getClass();
        System.out.println("Class name is " + pClass.getName());
        /*
        Get private method of privateClass, and then use pass types of parameters into the `getDeclearedMethod`
         */
        Method method = pClass.getDeclaredMethod("output", String.class, int.class);

        if (method != null) {
            /*
            Here has to set the Accessible to true, or will throws Exception.
             */
            method.setAccessible(true);
            method.invoke(privateClass, "output reflect ", 666);
        }

        Field privateField = pClass.getDeclaredField("MSG");
        System.out.println("Before Modify: MSG = " + privateClass.getMSG());
        /*
        Same reason as above.
         */
        privateField.setAccessible(true);
        privateField.set(privateClass, "MSGModified");
        System.out.println("After modify: MSG = " + privateClass.getMSG());

    }
}
