package GenericStudy.GenericClass;


public class GenericClassTesting {
    public static void main(String[] args) {
        GenericClassExample<Integer> genericInteger = new GenericClassExample<Integer>(123);
        GenericClassExample<String> genericString = new GenericClassExample<String>("Hello");

        System.out.println("genericInteger is " + genericInteger.getKey());
        System.out.println("genericString is " + genericString.getKey());

        System.out.println("********Below is without real parameter of type*******");
        GenericClassExample generic = new GenericClassExample(123);
        GenericClassExample generic2 = new GenericClassExample("String");

        System.out.println("Generic is " + generic.getKey());
        System.out.println("Generic2 is " + generic2.getKey());
    }

}
