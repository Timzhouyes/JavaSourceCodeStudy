package ReflectionStudy;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

class ReflectionStudy {
    static void main(String[] args) {
        Class tClass = ChildClass.class;
        System.out.println("Class name is " + tClass.getName());

        Field[] fields = tClass.getFields();

        for (Field field : fields) {
            int modifiers = field.getModifiers();
            System.out.println("Modifier int is " + modifiers);
            System.out.print("Modifier toString is " + Modifier.toString(modifiers) + "    ");
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println("***************************************************");

        fields = tClass.getDeclaredFields();
        for (Field field : fields) {
            int modifiers = field.getModifiers();
            System.out.println("Modifier int is " + modifiers);
            System.out.print("Modifier toString is " + Modifier.toString(modifiers));
            System.out.println(field.getType().getName() + " " + field.getName());
        }
    }

}
