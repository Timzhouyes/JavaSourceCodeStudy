package ReflectionStudy;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

class ReflectionStudyMethod {
    public static void main(String[] args) {
        Class mclass = ChildClass.class;
        System.out.println("Class name is " + mclass.getName());
        /*
        1. get all methodss which permission is "public" from its own and parent class
         */
        Method[] methods = mclass.getMethods();
        /*
        2. get all methods with all permissions, but only the class own
         */
//        Method[] methods = mclass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(Modifier.toString(method.getModifiers()) + " " + method.getReturnType() + " " + method.getName() + "(");
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.print(parameter.getType().getName() + " " + parameter.getName() + ",");
            }
            Class[] exceptions = method.getExceptionTypes();
            if (exceptions.length == 0) {
                System.out.println(")");
            } else {
                for (Class c : exceptions) {
                    System.out.println(") throws " + c.getName());
                }
            }
        }


    }
}
